package com.sdkwork.app.model;

public class AudioAsrAuditVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String fullText;
    private List<TimestampedSegment> segments;
    private TextAuditVO textAuditResult;
    private String overallResult;
    private String language;

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

    public String getFullText() {
        return this.fullText;
    }
    
    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public List<TimestampedSegment> getSegments() {
        return this.segments;
    }
    
    public void setSegments(List<TimestampedSegment> segments) {
        this.segments = segments;
    }

    public TextAuditVO getTextAuditResult() {
        return this.textAuditResult;
    }
    
    public void setTextAuditResult(TextAuditVO textAuditResult) {
        this.textAuditResult = textAuditResult;
    }

    public String getOverallResult() {
        return this.overallResult;
    }
    
    public void setOverallResult(String overallResult) {
        this.overallResult = overallResult;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
}
