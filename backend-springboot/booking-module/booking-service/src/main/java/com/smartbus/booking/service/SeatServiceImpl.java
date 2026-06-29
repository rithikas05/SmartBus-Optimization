package com.smartbus.booking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartbus.booking.dto.SeatResponseDTO;
import com.smartbus.booking.entity.Seat;
import com.smartbus.booking.entity.SeatStatus;
import com.smartbus.booking.repository.SeatRepository;

@Service
public class SeatServiceImpl implements SeatService {

    @Autowired
    private SeatRepository seatRepository;

    @Override
    public List<SeatResponseDTO> getAvailableSeats(Long tripId) {

        List<Seat> seats =
                seatRepository.findByTripIdAndStatus(
                        tripId,
                        SeatStatus.AVAILABLE);

        return seats.stream().map(seat -> {

            SeatResponseDTO dto = new SeatResponseDTO();

            dto.setSeatId(seat.getSeatId());
            dto.setSeatNumber(seat.getSeatNumber());
            dto.setStatus(seat.getStatus().name());

            return dto;

        }).collect(Collectors.toList());
    }
}