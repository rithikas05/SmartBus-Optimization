package com.smartbus.analytics.dto;

public class RevenueDTO {

    private double totalRevenue;
    private double dailyRevenue;
    private double monthlyRevenue;

    public RevenueDTO() {
    }

    public RevenueDTO(double totalRevenue, double dailyRevenue, double monthlyRevenue) {
        this.totalRevenue = totalRevenue;
        this.dailyRevenue = dailyRevenue;
        this.monthlyRevenue = monthlyRevenue;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public double getDailyRevenue() {
        return dailyRevenue;
    }

    public void setDailyRevenue(double dailyRevenue) {
        this.dailyRevenue = dailyRevenue;
    }

    public double getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public void setMonthlyRevenue(double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }
}