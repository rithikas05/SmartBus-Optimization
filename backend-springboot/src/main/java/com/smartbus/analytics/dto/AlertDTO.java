package com.smartbus.analytics.dto;

public class AlertDTO {

    private Long alertId;
    private String alertType;
    private String message;
    private String severity;
    private String status;

    public AlertDTO() {
    }

    public AlertDTO(Long alertId, String alertType, String message,
                    String severity, String status) {
        this.alertId = alertId;
        this.alertType = alertType;
        this.message = message;
        this.severity = severity;
        this.status = status;
    }

    public Long getAlertId() {
        return alertId;
    }

    public void setAlertId(Long alertId) {
        this.alertId = alertId;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}