package com.smartbus.analytics.dto;

public class OccupancyDTO {

    private int totalSeats;
    private int bookedSeats;
    private int availableSeats;
    private double occupancyPercentage;

    public OccupancyDTO() {
    }

    public OccupancyDTO(int totalSeats, int bookedSeats, int availableSeats, double occupancyPercentage) {
        this.totalSeats = totalSeats;
        this.bookedSeats = bookedSeats;
        this.availableSeats = availableSeats;
        this.occupancyPercentage = occupancyPercentage;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getOccupancyPercentage() {
        return occupancyPercentage;
    }

    public void setOccupancyPercentage(double occupancyPercentage) {
        this.occupancyPercentage = occupancyPercentage;
    }
}