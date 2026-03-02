package com.sdkwork.app.model;

public class EventTrackForm {
    private String eventName;
    private String eventType;
    private String timestamp;
    private String deviceId;
    private String userId;
    private Map<String, Object> properties;
    private String sessionId;
    private String pageUrl;
    private String referrer;

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

    public String getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Object> getProperties() {
        return this.properties;
    }
    
    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public String getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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
