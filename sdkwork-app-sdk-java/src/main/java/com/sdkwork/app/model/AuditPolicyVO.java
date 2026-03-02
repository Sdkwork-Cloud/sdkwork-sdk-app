package com.sdkwork.app.model;

public class AuditPolicyVO {
    private String createdAt;
    private String updatedAt;
    private String policyId;
    private String name;
    private String description;
    private List<String> scenes;
    private List<DetectionTypeConfig> detectionTypes;
    private Map<String, Double> thresholds;
    private Boolean enabled;
    private Integer priority;

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

    public String getPolicyId() {
        return this.policyId;
    }
    
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getScenes() {
        return this.scenes;
    }
    
    public void setScenes(List<String> scenes) {
        this.scenes = scenes;
    }

    public List<DetectionTypeConfig> getDetectionTypes() {
        return this.detectionTypes;
    }
    
    public void setDetectionTypes(List<DetectionTypeConfig> detectionTypes) {
        this.detectionTypes = detectionTypes;
    }

    public Map<String, Double> getThresholds() {
        return this.thresholds;
    }
    
    public void setThresholds(Map<String, Double> thresholds) {
        this.thresholds = thresholds;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getPriority() {
        return this.priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
