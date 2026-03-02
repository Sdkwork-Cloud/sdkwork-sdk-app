package com.sdkwork.app.model;

public class AdvertClickForm {
    private String advertId;
    private String positionId;
    private String clickTime;
    private String deviceId;
    private String ipAddress;
    private String userAgent;

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

    public String getClickTime() {
        return this.clickTime;
    }
    
    public void setClickTime(String clickTime) {
        this.clickTime = clickTime;
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
}
