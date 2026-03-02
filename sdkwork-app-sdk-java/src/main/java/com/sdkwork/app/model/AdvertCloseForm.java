package com.sdkwork.app.model;

public class AdvertCloseForm {
    private String advertId;
    private String positionId;
    private String closeTime;
    private String duration;
    private String deviceId;
    private String ipAddress;

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

    public String getCloseTime() {
        return this.closeTime;
    }
    
    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getDuration() {
        return this.duration;
    }
    
    public void setDuration(String duration) {
        this.duration = duration;
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
}
