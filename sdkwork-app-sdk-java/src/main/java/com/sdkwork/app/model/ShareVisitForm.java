package com.sdkwork.app.model;

public class ShareVisitForm {
    private String shareId;
    private String visitType;
    private String userAgent;
    private String ipAddress;
    private String deviceInfo;

    public String getShareId() {
        return this.shareId;
    }
    
    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getVisitType() {
        return this.visitType;
    }
    
    public void setVisitType(String visitType) {
        this.visitType = visitType;
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
