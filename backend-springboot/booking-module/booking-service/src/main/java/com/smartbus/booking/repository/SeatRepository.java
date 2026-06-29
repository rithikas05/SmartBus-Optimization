package com.smartbus.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartbus.booking.entity.Seat;
import com.smartbus.booking.entity.SeatStatus;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {

    List<Seat> findByTripId(Long tripId);

    List<Seat> findByTripIdAndStatus(Long tripId, SeatStatus status);

}