package com.sdkwork.app.model;

public class ViolationSegment {
    private Integer startTime;
    private Integer endTime;
    private String violationType;
    private String text;
    private Double confidence;

    public Integer getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getViolationType() {
        return this.violationType;
    }
    
    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public Double getConfidence() {
        return this.confidence;
    }
    
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }
}
