package com.sdkwork.app.model;

public class ErrorTrackForm {
    private String errorType;
    private String errorMessage;
    private String stackTrace;
    private String deviceId;
    private String userId;
    private String appVersion;
    private String deviceModel;
    private String osVersion;
    private String context;
    private String errorTime;

    public String getErrorType() {
        return this.errorType;
    }
    
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getStackTrace() {
        return this.stackTrace;
    }
    
    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAppVersion() {
        return this.appVersion;
    }
    
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }
    
    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getOsVersion() {
        return this.osVersion;
    }
    
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getContext() {
        return this.context;
    }
    
    public void setContext(String context) {
        this.context = context;
    }

    public String getErrorTime() {
        return this.errorTime;
    }
    
    public void setErrorTime(String errorTime) {
        this.errorTime = errorTime;
    }
}
