package com.sdkwork.app.model;

public class BatchImageAuditVO {
    private String createdAt;
    private String updatedAt;
    private String batchId;
    private List<ImageAuditItem> results;
    private String overallStatus;
    private Integer totalCount;
    private Integer passCount;
    private Integer rejectCount;

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

    public String getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public List<ImageAuditItem> getResults() {
        return this.results;
    }
    
    public void setResults(List<ImageAuditItem> results) {
        this.results = results;
    }

    public String getOverallStatus() {
        return this.overallStatus;
    }
    
    public void setOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPassCount() {
        return this.passCount;
    }
    
    public void setPassCount(Integer passCount) {
        this.passCount = passCount;
    }

    public Integer getRejectCount() {
        return this.rejectCount;
    }
    
    public void setRejectCount(Integer rejectCount) {
        this.rejectCount = rejectCount;
    }
}
