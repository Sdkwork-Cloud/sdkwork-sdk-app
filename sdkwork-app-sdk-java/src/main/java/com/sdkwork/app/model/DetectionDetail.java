package com.sdkwork.app.model;

public class DetectionDetail {
    private String type;
    private Boolean hit;
    private Double confidence;
    private List<String> keywords;

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

    public List<String> getKeywords() {
        return this.keywords;
    }
    
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
}
