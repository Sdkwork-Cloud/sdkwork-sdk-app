package com.sdkwork.app.model;

public class ExperimentReportVO {
    private String createdAt;
    private String updatedAt;
    private String experimentKey;
    private String reportType;
    private Map<String, Object> reportData;
    private String generatedAt;
    private String version;

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

    public String getExperimentKey() {
        return this.experimentKey;
    }
    
    public void setExperimentKey(String experimentKey) {
        this.experimentKey = experimentKey;
    }

    public String getReportType() {
        return this.reportType;
    }
    
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public Map<String, Object> getReportData() {
        return this.reportData;
    }
    
    public void setReportData(Map<String, Object> reportData) {
        this.reportData = reportData;
    }

    public String getGeneratedAt() {
        return this.generatedAt;
    }
    
    public void setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
}
