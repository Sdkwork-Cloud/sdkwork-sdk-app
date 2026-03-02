package com.sdkwork.app.model;

public class AnomalyPattern {
    private String type;
    private String description;
    private String severity;
    private String detectedAt;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return this.severity;
    }
    
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDetectedAt() {
        return this.detectedAt;
    }
    
    public void setDetectedAt(String detectedAt) {
        this.detectedAt = detectedAt;
    }
}
