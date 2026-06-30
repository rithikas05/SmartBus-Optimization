package com.smartbus.booking.service;
import java.util.List;

import com.smartbus.booking.dto.SeatResponseDTO;
import com.smartbus.booking.entity.Seat;

public interface SeatService {

    List<SeatResponseDTO> getAvailableSeats(Long tripId);

    Seat createSeat(Seat seat);

}