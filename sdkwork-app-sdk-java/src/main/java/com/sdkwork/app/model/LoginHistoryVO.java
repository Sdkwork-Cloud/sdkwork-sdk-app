package com.sdkwork.app.model;

public class LoginHistoryVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String loginTime;
    private String ipAddress;
    private String location;
    private String device;
    private String browser;
    private String os;
    private String loginMethod;
    private String status;
    private String result;
    private String failureReason;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    public String getDevice() {
        return this.device;
    }
    
    public void setDevice(String device) {
        this.device = device;
    }

    public String getBrowser() {
        return this.browser;
    }
    
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOs() {
        return this.os;
    }
    
    public void setOs(String os) {
        this.os = os;
    }

    public String getLoginMethod() {
        return this.loginMethod;
    }
    
    public void setLoginMethod(String loginMethod) {
        this.loginMethod = loginMethod;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }

    public String getFailureReason() {
        return this.failureReason;
    }
    
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }
}
