package com.sdkwork.app.model;

public class FrameDetection {
    private Integer timestamp;
    private String result;
    private String riskLevel;

    public Integer getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }

    public String getRiskLevel() {
        return this.riskLevel;
    }
    
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
}
