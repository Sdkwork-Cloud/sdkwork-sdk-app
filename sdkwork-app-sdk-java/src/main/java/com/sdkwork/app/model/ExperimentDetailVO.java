package com.sdkwork.app.model;

public class ExperimentDetailVO {
    private String createdAt;
    private String updatedAt;
    private String experimentKey;
    private String experimentName;
    private String experimentDescription;
    private String status;
    private List<Map<String, Object>> variants;
    private Map<String, Object> config;

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

    public String getExperimentName() {
        return this.experimentName;
    }
    
    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    public String getExperimentDescription() {
        return this.experimentDescription;
    }
    
    public void setExperimentDescription(String experimentDescription) {
        this.experimentDescription = experimentDescription;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public List<Map<String, Object>> getVariants() {
        return this.variants;
    }
    
    public void setVariants(List<Map<String, Object>> variants) {
        this.variants = variants;
    }

    public Map<String, Object> getConfig() {
        return this.config;
    }
    
    public void setConfig(Map<String, Object> config) {
        this.config = config;
    }
}
