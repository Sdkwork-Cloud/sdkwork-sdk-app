package com.sdkwork.app.model;

public class ShareTrackForm {
    private String shareId;
    private String trackType;
    private String userAgent;
    private String ipAddress;
    private String deviceInfo;

    public String getShareId() {
        return this.shareId;
    }
    
    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getTrackType() {
        return this.trackType;
    }
    
    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    public String getUserAgent() {
        return this.userAgent;
    }
    
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getDeviceInfo() {
        return this.deviceInfo;
    }
    
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }
}
