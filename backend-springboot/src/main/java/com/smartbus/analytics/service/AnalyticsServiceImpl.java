package com.smartbus.analytics.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smartbus.analytics.dto.AlertDTO;
import com.smartbus.analytics.dto.OccupancyDTO;
import com.smartbus.analytics.dto.RecommendationDTO;
import com.smartbus.analytics.dto.RevenueDTO;
import com.smartbus.analytics.dto.RoutePerformanceDTO;

@Service
public class AnalyticsServiceImpl implements AnalyticsService {

    @Override
    public OccupancyDTO getOccupancyDashboard() {
        return new OccupancyDTO();
    }

    @Override
    public RevenueDTO getRevenueDashboard() {
        return new RevenueDTO();
    }

    @Override
    public RoutePerformanceDTO getRoutePerformance() {
        return new RoutePerformanceDTO();
    }

    @Override
    public List<AlertDTO> getAllAlerts() {
        return new ArrayList<>();
    }

    @Override
    public List<RecommendationDTO> getAllRecommendations() {
        return new ArrayList<>();
    }
}