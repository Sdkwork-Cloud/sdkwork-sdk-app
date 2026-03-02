package com.sdkwork.app.model;

public class ShareVisitorVO {
    private String createdAt;
    private String updatedAt;
    private String visitorId;
    private String visitTime;
    private String userAgent;
    private String ipAddress;
    private String deviceInfo;
    private String visitType;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getVisitorId() {
        return this.visitorId;
    }
    
    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitTime() {
        return this.visitTime;
    }
    
    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
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

    public String getVisitType() {
        return this.visitType;
    }
    
    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }
}
