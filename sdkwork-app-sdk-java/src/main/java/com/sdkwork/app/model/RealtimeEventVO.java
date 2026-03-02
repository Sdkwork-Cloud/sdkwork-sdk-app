package com.sdkwork.app.model;

public class RealtimeEventVO {
    private String createdAt;
    private String updatedAt;
    private String eventId;
    private String eventName;
    private String eventType;
    private String userId;
    private String deviceId;
    private String timestamp;
    private String pageUrl;
    private String referrer;

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

    public String getEventId() {
        return this.eventId;
    }
    
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return this.eventName;
    }
    
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return this.eventType;
    }
    
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPageUrl() {
        return this.pageUrl;
    }
    
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getReferrer() {
        return this.referrer;
    }
    
    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }
}
