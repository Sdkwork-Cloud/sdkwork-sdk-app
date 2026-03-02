package com.sdkwork.app.model;

public class AdvertReportForm {
    private String advertId;
    private String reportType;
    private String reason;
    private String screenshotUrl;
    private String deviceId;
    private String ipAddress;

    public String getAdvertId() {
        return this.advertId;
    }
    
    public void setAdvertId(String advertId) {
        this.advertId = advertId;
    }

    public String getReportType() {
        return this.reportType;
    }
    
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getScreenshotUrl() {
        return this.screenshotUrl;
    }
    
    public void setScreenshotUrl(String screenshotUrl) {
        this.screenshotUrl = screenshotUrl;
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
}
