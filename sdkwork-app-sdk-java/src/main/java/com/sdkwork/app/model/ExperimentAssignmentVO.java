package com.sdkwork.app.model;

public class ExperimentAssignmentVO {
    private String createdAt;
    private String updatedAt;
    private String experimentKey;
    private String variantKey;
    private String variantName;
    private String assignmentReason;
    private Map<String, Object> assignmentParams;

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

    public String getVariantKey() {
        return this.variantKey;
    }
    
    public void setVariantKey(String variantKey) {
        this.variantKey = variantKey;
    }

    public String getVariantName() {
        return this.variantName;
    }
    
    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    public String getAssignmentReason() {
        return this.assignmentReason;
    }
    
    public void setAssignmentReason(String assignmentReason) {
        this.assignmentReason = assignmentReason;
    }

    public Map<String, Object> getAssignmentParams() {
        return this.assignmentParams;
    }
    
    public void setAssignmentParams(Map<String, Object> assignmentParams) {
        this.assignmentParams = assignmentParams;
    }
}
