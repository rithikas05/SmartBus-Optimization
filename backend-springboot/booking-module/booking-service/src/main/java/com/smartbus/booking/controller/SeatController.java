package com.smartbus.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartbus.booking.dto.SeatResponseDTO;
import com.smartbus.booking.entity.Seat;
import com.smartbus.booking.service.SeatService;

@RestController
@RequestMapping("/api/seats")
public class SeatController {

    @Autowired
    private SeatService seatService;

    // Get Available Seats
    @GetMapping("/{tripId}")
    public List<SeatResponseDTO> getAvailableSeats(@PathVariable Long tripId) {

        return seatService.getAvailableSeats(tripId);

    }
    @PostMapping
    public Seat createSeat(@RequestBody Seat seat) {

        return seatService.createSeat(seat);

    }
}