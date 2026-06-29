package com.smartbus.booking.service;

import java.util.List;

import com.smartbus.booking.dto.SeatResponseDTO;

public interface SeatService {

    List<SeatResponseDTO> getAvailableSeats(Long tripId);

}