package com.sdkwork.app.model;

public class AdvertImpressionForm {
    private String advertId;
    private String positionId;
    private String impressionTime;
    private String deviceId;
    private String ipAddress;
    private String userAgent;
    private String screenSize;

    public String getAdvertId() {
        return this.advertId;
    }
    
    public void setAdvertId(String advertId) {
        this.advertId = advertId;
    }

    public String getPositionId() {
        return this.positionId;
    }
    
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getImpressionTime() {
        return this.impressionTime;
    }
    
    public void setImpressionTime(String impressionTime) {
        this.impressionTime = impressionTime;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserAgent() {
        return this.userAgent;
    }
    
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getScreenSize() {
        return this.screenSize;
    }
    
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
