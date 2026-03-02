package com.sdkwork.app.model;

public class CheckInMakeUpVO {
    private String createdAt;
    private String updatedAt;
    private Boolean success;
    private String date;
    private Integer costPoints;
    private Integer remainingPoints;
    private Integer consecutiveDays;
    private String message;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public Integer getCostPoints() {
        return this.costPoints;
    }
    
    public void setCostPoints(Integer costPoints) {
        this.costPoints = costPoints;
    }

    public Integer getRemainingPoints() {
        return this.remainingPoints;
    }
    
    public void setRemainingPoints(Integer remainingPoints) {
        this.remainingPoints = remainingPoints;
    }

    public Integer getConsecutiveDays() {
        return this.consecutiveDays;
    }
    
    public void setConsecutiveDays(Integer consecutiveDays) {
        this.consecutiveDays = consecutiveDays;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
