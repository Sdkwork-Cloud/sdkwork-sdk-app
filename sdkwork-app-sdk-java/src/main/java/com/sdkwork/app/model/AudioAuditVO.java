package com.sdkwork.app.model;

public class AudioAuditVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String result;
    private String riskLevel;
    private Integer duration;
    private String transcript;
    private List<ViolationSegment> violationSegments;
    private String suggestion;

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

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getTranscript() {
        return this.transcript;
    }
    
    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public List<ViolationSegment> getViolationSegments() {
        return this.violationSegments;
    }
    
    public void setViolationSegments(List<ViolationSegment> violationSegments) {
        this.violationSegments = violationSegments;
    }

    public String getSuggestion() {
        return this.suggestion;
    }
    
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
