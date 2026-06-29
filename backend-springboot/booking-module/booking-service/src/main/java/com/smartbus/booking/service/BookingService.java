package com.smartbus.booking.service;

import java.util.List;

import com.smartbus.booking.dto.BookingDetailsDTO;
import com.smartbus.booking.dto.BookingRequestDTO;
import com.smartbus.booking.dto.BookingResponseDTO;

public interface BookingService {

    BookingResponseDTO createBooking(BookingRequestDTO requestDTO);

    BookingDetailsDTO getBookingById(Long bookingId);

    List<BookingDetailsDTO> getBookingsByUser(Long userId);

    String cancelBooking(Long bookingId);

}