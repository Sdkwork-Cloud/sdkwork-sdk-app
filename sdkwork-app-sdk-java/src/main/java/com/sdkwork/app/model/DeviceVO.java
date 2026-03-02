package com.sdkwork.app.model;

public class DeviceVO {
    private String createdAt;
    private String updatedAt;
    private String deviceId;
    private String deviceType;
    private String deviceName;
    private String pushToken;
    private String osVersion;
    private String appVersion;
    private Boolean isActive;
    private String registerTime;
    private String lastActiveAt;

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

    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return this.deviceType;
    }
    
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceName() {
        return this.deviceName;
    }
    
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getPushToken() {
        return this.pushToken;
    }
    
    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public String getOsVersion() {
        return this.osVersion;
    }
    
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getAppVersion() {
        return this.appVersion;
    }
    
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getRegisterTime() {
        return this.registerTime;
    }
    
    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getLastActiveAt() {
        return this.lastActiveAt;
    }
    
    public void setLastActiveAt(String lastActiveAt) {
        this.lastActiveAt = lastActiveAt;
    }
}
