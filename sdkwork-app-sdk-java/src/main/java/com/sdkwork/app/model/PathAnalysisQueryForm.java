package com.sdkwork.app.model;

public class PathAnalysisQueryForm {
    private String startDate;
    private String endDate;
    private String startPage;
    private String endPage;
    private Integer maxSteps;
    private String deviceType;
    private String osType;

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

    public String getStartPage() {
        return this.startPage;
    }
    
    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

    public String getEndPage() {
        return this.endPage;
    }
    
    public void setEndPage(String endPage) {
        this.endPage = endPage;
    }

    public Integer getMaxSteps() {
        return this.maxSteps;
    }
    
    public void setMaxSteps(Integer maxSteps) {
        this.maxSteps = maxSteps;
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
