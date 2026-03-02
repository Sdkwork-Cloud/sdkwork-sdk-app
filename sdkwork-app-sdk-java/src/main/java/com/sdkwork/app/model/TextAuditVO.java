package com.sdkwork.app.model;

public class TextAuditVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String result;
    private String riskLevel;
    private Double confidence;
    private List<DetectionDetail> details;
    private List<String> sensitiveWords;
    private String suggestion;
    private String processedText;

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

    public String getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(String taskId) {
        this.taskId = taskId;
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

    public Double getConfidence() {
        return this.confidence;
    }
    
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public List<DetectionDetail> getDetails() {
        return this.details;
    }
    
    public void setDetails(List<DetectionDetail> details) {
        this.details = details;
    }

    public List<String> getSensitiveWords() {
        return this.sensitiveWords;
    }
    
    public void setSensitiveWords(List<String> sensitiveWords) {
        this.sensitiveWords = sensitiveWords;
    }

    public String getSuggestion() {
        return this.suggestion;
    }
    
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getProcessedText() {
        return this.processedText;
    }
    
    public void setProcessedText(String processedText) {
        this.processedText = processedText;
    }
}
