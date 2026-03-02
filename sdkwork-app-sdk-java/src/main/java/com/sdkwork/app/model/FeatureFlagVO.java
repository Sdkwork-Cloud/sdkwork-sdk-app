package com.sdkwork.app.model;

public class FeatureFlagVO {
    private String createdAt;
    private String updatedAt;
    private String featureKey;
    private String featureName;
    private Boolean enabled;
    private Object value;
    private String description;

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

    public String getFeatureKey() {
        return this.featureKey;
    }
    
    public void setFeatureKey(String featureKey) {
        this.featureKey = featureKey;
    }

    public String getFeatureName() {
        return this.featureName;
    }
    
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Object getValue() {
        return this.value;
    }
    
    public void setValue(Object value) {
        this.value = value;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
