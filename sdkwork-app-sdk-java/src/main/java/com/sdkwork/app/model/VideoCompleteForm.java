package com.sdkwork.app.model;

public class VideoCompleteForm {
    private String advertId;
    private String videoId;
    private String completeTime;
    private String duration;
    private String deviceId;
    private String ipAddress;

    public String getAdvertId() {
        return this.advertId;
    }
    
    public void setAdvertId(String advertId) {
        this.advertId = advertId;
    }

    public String getVideoId() {
        return this.videoId;
    }
    
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getCompleteTime() {
        return this.completeTime;
    }
    
    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
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
