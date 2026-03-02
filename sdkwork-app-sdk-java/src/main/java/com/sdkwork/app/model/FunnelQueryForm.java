package com.sdkwork.app.model;

public class FunnelQueryForm {
    private String funnelName;
    private List<String> events;
    private String startDate;
    private String endDate;
    private String deviceType;
    private String osType;

    public String getFunnelName() {
        return this.funnelName;
    }
    
    public void setFunnelName(String funnelName) {
        this.funnelName = funnelName;
    }

    public List<String> getEvents() {
        return this.events;
    }
    
    public void setEvents(List<String> events) {
        this.events = events;
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
}
