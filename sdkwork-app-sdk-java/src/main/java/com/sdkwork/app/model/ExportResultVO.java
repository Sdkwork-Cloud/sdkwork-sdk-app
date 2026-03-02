package com.sdkwork.app.model;

public class ExportResultVO {
    private String createdAt;
    private String updatedAt;
    private String exportId;
    private String reportType;
    private String status;
    private String downloadUrl;
    private Integer fileSize;
    private String completedAt;
    private String errorMessage;

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

    public String getExportId() {
        return this.exportId;
    }
    
    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    public String getReportType() {
        return this.reportType;
    }
    
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getCompletedAt() {
        return this.completedAt;
    }
    
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
