package com.sdkwork.app.model;

public class ReportTypeVO {
    private String createdAt;
    private String updatedAt;
    private String reportTypeId;
    private String reportName;
    private String reportType;
    private String description;
    private Boolean enabled;
    private String icon;

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

    public String getReportTypeId() {
        return this.reportTypeId;
    }
    
    public void setReportTypeId(String reportTypeId) {
        this.reportTypeId = reportTypeId;
    }

    public String getReportName() {
        return this.reportName;
    }
    
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportType() {
        return this.reportType;
    }
    
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }
}
