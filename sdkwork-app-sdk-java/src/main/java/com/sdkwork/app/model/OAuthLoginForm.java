package com.sdkwork.app.model;

public class OAuthLoginForm {
    private String provider;
    private String code;
    private String state;
    private String deviceId;
    private String deviceType;

    public String getProvider() {
        return this.provider;
    }
    
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
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
}
