package com.sdkwork.app.model;

public class ImageDetectionDetail {
    private String type;
    private Boolean hit;
    private Double confidence;
    private String subType;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Boolean getHit() {
        return this.hit;
    }
    
    public void setHit(Boolean hit) {
        this.hit = hit;
    }

    public Double getConfidence() {
        return this.confidence;
    }
    
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public String getSubType() {
        return this.subType;
    }
    
    public void setSubType(String subType) {
        this.subType = subType;
    }
}
