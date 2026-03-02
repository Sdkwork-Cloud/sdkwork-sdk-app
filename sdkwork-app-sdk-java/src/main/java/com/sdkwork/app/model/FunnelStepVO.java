package com.sdkwork.app.model;

public class FunnelStepVO {
    private String createdAt;
    private String updatedAt;
    private String eventName;
    private Integer userCount;
    private Double conversionRate;
    private Double stepConversionRate;

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

    public String getEventName() {
        return this.eventName;
    }
    
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Integer getUserCount() {
        return this.userCount;
    }
    
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Double getConversionRate() {
        return this.conversionRate;
    }
    
    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Double getStepConversionRate() {
        return this.stepConversionRate;
    }
    
    public void setStepConversionRate(Double stepConversionRate) {
        this.stepConversionRate = stepConversionRate;
    }
}
