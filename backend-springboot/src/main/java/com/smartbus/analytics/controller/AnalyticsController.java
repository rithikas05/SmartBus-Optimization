package com.smartbus.analytics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartbus.analytics.dto.AlertDTO;
import com.smartbus.analytics.dto.OccupancyDTO;
import com.smartbus.analytics.dto.RecommendationDTO;
import com.smartbus.analytics.dto.RevenueDTO;
import com.smartbus.analytics.dto.RoutePerformanceDTO;
import com.smartbus.analytics.service.AnalyticsService;

@RestController
@RequestMapping("/api/analytics")
@CrossOrigin(origins = "*")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping("/occupancy")
    public OccupancyDTO getOccupancyDashboard() {
        return analyticsService.getOccupancyDashboard();
    }

    @GetMapping("/revenue")
    public RevenueDTO getRevenueDashboard() {
        return analyticsService.getRevenueDashboard();
    }

    @GetMapping("/route-performance")
    public RoutePerformanceDTO getRoutePerformance() {
        return analyticsService.getRoutePerformance();
    }

    @GetMapping("/alerts")
    public List<AlertDTO> getAllAlerts() {
        return analyticsService.getAllAlerts();
    }

    @GetMapping("/recommendations")
    public List<RecommendationDTO> getAllRecommendations() {
        return analyticsService.getAllRecommendations();
    }
}