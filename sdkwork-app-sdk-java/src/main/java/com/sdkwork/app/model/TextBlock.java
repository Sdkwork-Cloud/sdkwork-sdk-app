package com.sdkwork.app.model;

public class TextBlock {
    private String text;
    private Region region;
    private Double confidence;

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public Region getRegion() {
        return this.region;
    }
    
    public void setRegion(Region region) {
        this.region = region;
    }

    public Double getConfidence() {
        return this.confidence;
    }
    
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }
}
