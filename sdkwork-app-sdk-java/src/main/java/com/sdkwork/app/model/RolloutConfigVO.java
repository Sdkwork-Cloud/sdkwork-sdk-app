package com.sdkwork.app.model;

public class RolloutConfigVO {
    private String createdAt;
    private String updatedAt;
    private String rolloutKey;
    private String rolloutName;
    private Map<String, Object> config;
    private String status;

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

    public String getRolloutKey() {
        return this.rolloutKey;
    }
    
    public void setRolloutKey(String rolloutKey) {
        this.rolloutKey = rolloutKey;
    }

    public String getRolloutName() {
        return this.rolloutName;
    }
    
    public void setRolloutName(String rolloutName) {
        this.rolloutName = rolloutName;
    }

    public Map<String, Object> getConfig() {
        return this.config;
    }
    
    public void setConfig(Map<String, Object> config) {
        this.config = config;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
