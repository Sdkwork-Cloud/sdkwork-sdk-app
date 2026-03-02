package com.sdkwork.app.model;

public class UserActivityVO {
    private String createdAt;
    private String updatedAt;
    private String activityId;
    private String userId;
    private String activityType;
    private String activityName;
    private String timestamp;
    private String deviceId;
    private String ipAddress;
    private String pageUrl;
    private String referrer;

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

    public String getActivityId() {
        return this.activityId;
    }
    
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActivityType() {
        return this.activityType;
    }
    
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getActivityName() {
        return this.activityName;
    }
    
    public void setActivityName(String activityName) {
        this.activityName = activityName;
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

    public String getPageUrl() {
        return this.pageUrl;
    }
    
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getReferrer() {
        return this.referrer;
    }
    
    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }
}
