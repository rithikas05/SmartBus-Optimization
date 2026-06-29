package com.smartbus.analytics.service;

import java.util.List;

import com.smartbus.analytics.dto.AlertDTO;
import com.smartbus.analytics.dto.OccupancyDTO;
import com.smartbus.analytics.dto.RecommendationDTO;
import com.smartbus.analytics.dto.RevenueDTO;
import com.smartbus.analytics.dto.RoutePerformanceDTO;

public interface AnalyticsService {

    OccupancyDTO getOccupancyDashboard();

    RevenueDTO getRevenueDashboard();

    RoutePerformanceDTO getRoutePerformance();

    List<AlertDTO> getAllAlerts();

    List<RecommendationDTO> getAllRecommendations();
}