package com.sdkwork.app.model;

public class TopEventVO {
    private String createdAt;
    private String updatedAt;
    private String eventName;
    private Integer count;
    private Double percentage;
    private String eventType;

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

    public Integer getCount() {
        return this.count;
    }
    
    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPercentage() {
        return this.percentage;
    }
    
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String getEventType() {
        return this.eventType;
    }
    
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
