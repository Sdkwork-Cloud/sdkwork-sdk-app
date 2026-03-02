package com.sdkwork.app.model;

public class VideoProgressForm {
    private String advertId;
    private String videoId;
    private Integer progress;
    private String timestamp;
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

    public Integer getProgress() {
        return this.progress;
    }
    
    public void setProgress(Integer progress) {
        this.progress = progress;
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

    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
