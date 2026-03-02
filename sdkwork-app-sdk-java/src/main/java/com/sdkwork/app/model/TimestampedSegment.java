package com.sdkwork.app.model;

public class TimestampedSegment {
    private Integer startTime;
    private Integer endTime;
    private String text;
    private Integer speakerId;
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

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public Integer getSpeakerId() {
        return this.speakerId;
    }
    
    public void setSpeakerId(Integer speakerId) {
        this.speakerId = speakerId;
    }

    public Double getConfidence() {
        return this.confidence;
    }
    
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }
}
