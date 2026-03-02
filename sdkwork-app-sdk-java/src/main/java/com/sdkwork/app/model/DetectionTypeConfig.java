package com.sdkwork.app.model;

public class DetectionTypeConfig {
    private String type;
    private String name;
    private Boolean enabled;
    private String sensitivity;
    private Double threshold;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getSensitivity() {
        return this.sensitivity;
    }
    
    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }

    public Double getThreshold() {
        return this.threshold;
    }
    
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }
}
