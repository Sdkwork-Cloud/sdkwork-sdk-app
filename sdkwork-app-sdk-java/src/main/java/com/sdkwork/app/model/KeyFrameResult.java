package com.sdkwork.app.model;

public class KeyFrameResult {
    private Integer timestamp;
    private String frameUrl;
    private ImageAuditVO detectionResult;

    public Integer getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getFrameUrl() {
        return this.frameUrl;
    }
    
    public void setFrameUrl(String frameUrl) {
        this.frameUrl = frameUrl;
    }

    public ImageAuditVO getDetectionResult() {
        return this.detectionResult;
    }
    
    public void setDetectionResult(ImageAuditVO detectionResult) {
        this.detectionResult = detectionResult;
    }
}
