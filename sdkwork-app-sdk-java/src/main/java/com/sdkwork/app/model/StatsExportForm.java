package com.sdkwork.app.model;

public class StatsExportForm {
    private String reportType;
    private String startDate;
    private String endDate;
    private String format;
    private String email;
    private String deviceType;
    private String osType;

    public String getReportType() {
        return this.reportType;
    }
    
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeviceType() {
        return this.deviceType;
    }
    
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getOsType() {
        return this.osType;
    }
    
    public void setOsType(String osType) {
        this.osType = osType;
    }
}
