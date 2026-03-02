package com.sdkwork.app.model;

public class EventTrendQueryForm {
    private String eventName;
    private String startDate;
    private String endDate;
    private String interval;
    private String deviceType;
    private String osType;
    private String channel;

    public String getEventName() {
        return this.eventName;
    }
    
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getInterval() {
        return this.interval;
    }
    
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getDeviceType() {
        return this.deviceType;
    }
    
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getOsType() {
        return this.osType;
    }
    
    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }
}
