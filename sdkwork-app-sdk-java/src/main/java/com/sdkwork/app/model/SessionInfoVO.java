package com.sdkwork.app.model;

public class SessionInfoVO {
    private String createdAt;
    private String updatedAt;
    private String sessionId;
    private String loginTime;
    private String lastActivityTime;
    private String ipAddress;
    private String location;
    private String device;
    private String browser;
    private String os;
    private String loginMethod;
    private String status;
    private Integer remainingMinutes;

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

    public String getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getLastActivityTime() {
        return this.lastActivityTime;
    }
    
    public void setLastActivityTime(String lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
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

    public Integer getRemainingMinutes() {
        return this.remainingMinutes;
    }
    
    public void setRemainingMinutes(Integer remainingMinutes) {
        this.remainingMinutes = remainingMinutes;
    }
}
