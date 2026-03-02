package com.sdkwork.app.model;

public class DeviceRegisterForm {
    private String deviceType;
    private String deviceId;
    private String pushToken;
    private String osVersion;
    private String appVersion;

    public String getDeviceType() {
        return this.deviceType;
    }
    
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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
}
