package com.smartbus.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartbus.booking.dto.BookingDetailsDTO;
import com.smartbus.booking.dto.BookingRequestDTO;
import com.smartbus.booking.dto.BookingResponseDTO;
import com.smartbus.booking.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // Create Booking
    @PostMapping
    public BookingResponseDTO createBooking(@RequestBody BookingRequestDTO requestDTO) {
        return bookingService.createBooking(requestDTO);
    }

    // Booking Details
    @GetMapping("/{bookingId}")
    public BookingDetailsDTO getBookingById(@PathVariable Long bookingId) {
        return bookingService.getBookingById(bookingId);
    }

    // User Booking History
    @GetMapping("/user/{userId}")
    public List<BookingDetailsDTO> getBookingsByUser(@PathVariable Long userId) {
        return bookingService.getBookingsByUser(userId);
    }

    // Cancel Booking
    @DeleteMapping("/{bookingId}")
    public String cancelBooking(@PathVariable Long bookingId) {
        return bookingService.cancelBooking(bookingId);
    }
}