package com.sdkwork.app.model;

public class ImageAuditVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String result;
    private String riskLevel;
    private Double confidence;
    private List<ImageDetectionDetail> details;
    private List<Region> violationRegions;
    private String suggestion;

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

    public String getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }

    public String getRiskLevel() {
        return this.riskLevel;
    }
    
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Double getConfidence() {
        return this.confidence;
    }
    
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public List<ImageDetectionDetail> getDetails() {
        return this.details;
    }
    
    public void setDetails(List<ImageDetectionDetail> details) {
        this.details = details;
    }

    public List<Region> getViolationRegions() {
        return this.violationRegions;
    }
    
    public void setViolationRegions(List<Region> violationRegions) {
        this.violationRegions = violationRegions;
    }

    public String getSuggestion() {
        return this.suggestion;
    }
    
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
