package com.smartbus.booking.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartbus.booking.dto.BookingDetailsDTO;
import com.smartbus.booking.dto.BookingRequestDTO;
import com.smartbus.booking.dto.BookingResponseDTO;
import com.smartbus.booking.entity.Booking;
import com.smartbus.booking.entity.BookingStatus;
import com.smartbus.booking.entity.Seat;
import com.smartbus.booking.entity.SeatStatus;
import com.smartbus.booking.exception.BookingNotFoundException;
import com.smartbus.booking.repository.BookingRepository;
import com.smartbus.booking.repository.SeatRepository;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private SeatRepository seatRepository;

    @Override
    public BookingResponseDTO createBooking(BookingRequestDTO requestDTO) {

        Seat seat = seatRepository.findById(requestDTO.getSeatId())
                .orElseThrow(() -> new RuntimeException("Seat not found"));

        if (seat.getStatus() == SeatStatus.BOOKED) {
            throw new RuntimeException("Seat already booked");
        }

        Booking booking = new Booking();
        booking.setUserId(requestDTO.getUserId());
        booking.setTripId(requestDTO.getTripId());
        booking.setSeatId(requestDTO.getSeatId());

        // Temporary fare value
        booking.setFareAmount(500.0);

        booking.setBookingDate(LocalDateTime.now());
        booking.setStatus(BookingStatus.CONFIRMED);

        Booking savedBooking = bookingRepository.save(booking);

        seat.setStatus(SeatStatus.BOOKED);
        seatRepository.save(seat);

        BookingResponseDTO response = new BookingResponseDTO();
        response.setBookingId(savedBooking.getBookingId());
        response.setStatus(savedBooking.getStatus().name());

        return response;
    }

    @Override
    public BookingDetailsDTO getBookingById(Long bookingId) {

        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() ->
                        new BookingNotFoundException("Booking not found"));

        return mapToDTO(booking);
    }

    @Override
    public List<BookingDetailsDTO> getBookingsByUser(Long userId) {

        return bookingRepository.findByUserId(userId)
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public String cancelBooking(Long bookingId) {

        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() ->
                        new BookingNotFoundException("Booking not found"));

        booking.setStatus(BookingStatus.CANCELLED);

        Seat seat = seatRepository.findById(booking.getSeatId())
                .orElseThrow(() -> new RuntimeException("Seat not found"));

        seat.setStatus(SeatStatus.AVAILABLE);

        seatRepository.save(seat);
        bookingRepository.save(booking);

        return "Booking cancelled successfully";
    }

    private BookingDetailsDTO mapToDTO(Booking booking) {

        BookingDetailsDTO dto = new BookingDetailsDTO();

        dto.setBookingId(booking.getBookingId());
        dto.setUserId(booking.getUserId());
        dto.setTripId(booking.getTripId());
        dto.setSeatId(booking.getSeatId());
        dto.setFareAmount(booking.getFareAmount());
        dto.setBookingDate(booking.getBookingDate());
        dto.setStatus(booking.getStatus().name());

        return dto;
    }
}