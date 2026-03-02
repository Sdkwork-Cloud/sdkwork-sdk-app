package com.sdkwork.app.model;

public class BatchEventTrackForm {
    private List<EventTrackForm> events;
    private String deviceId;
    private String userId;
    private String submitTime;

    public List<EventTrackForm> getEvents() {
        return this.events;
    }
    
    public void setEvents(List<EventTrackForm> events) {
        this.events = events;
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

    public String getSubmitTime() {
        return this.submitTime;
    }
    
    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }
}
