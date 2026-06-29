package com.smartbus.analytics.dto;

public class RecommendationDTO {

    private Long recommendationId;
    private Long routeId;
    private String recommendationType;
    private String description;
    private String priority;

    public RecommendationDTO() {
    }

    public RecommendationDTO(Long recommendationId, Long routeId,
                             String recommendationType,
                             String description,
                             String priority) {
        this.recommendationId = recommendationId;
        this.routeId = routeId;
        this.recommendationType = recommendationType;
        this.description = description;
        this.priority = priority;
    }

    public Long getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(Long recommendationId) {
        this.recommendationId = recommendationId;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public String getRecommendationType() {
        return recommendationType;
    }

    public void setRecommendationType(String recommendationType) {
        this.recommendationType = recommendationType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}