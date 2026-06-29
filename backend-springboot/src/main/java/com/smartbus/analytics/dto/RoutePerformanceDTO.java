package com.smartbus.analytics.dto;

public class RoutePerformanceDTO {

    private String routeName;
    private int totalTrips;
    private int totalBookings;
    private double occupancyPercentage;
    private double revenue;

    public RoutePerformanceDTO() {
    }

    public RoutePerformanceDTO(String routeName, int totalTrips, int totalBookings,
                               double occupancyPercentage, double revenue) {
        this.routeName = routeName;
        this.totalTrips = totalTrips;
        this.totalBookings = totalBookings;
        this.occupancyPercentage = occupancyPercentage;
        this.revenue = revenue;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public int getTotalTrips() {
        return totalTrips;
    }

    public void setTotalTrips(int totalTrips) {
        this.totalTrips = totalTrips;
    }

    public int getTotalBookings() {
        return totalBookings;
    }

    public void setTotalBookings(int totalBookings) {
        this.totalBookings = totalBookings;
    }

    public double getOccupancyPercentage() {
        return occupancyPercentage;
    }

    public void setOccupancyPercentage(double occupancyPercentage) {
        this.occupancyPercentage = occupancyPercentage;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}