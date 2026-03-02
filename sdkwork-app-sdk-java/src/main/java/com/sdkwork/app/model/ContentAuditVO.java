package com.sdkwork.app.model;

public class ContentAuditVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String contentId;
    private String overallResult;
    private String riskLevel;
    private Map<String, AuditResultItem> results;
    private TextAuditVO textResult;
    private List<ImageAuditVO> imageResults;
    private VideoAuditVO videoResult;
    private AudioAuditVO audioResult;
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

    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getOverallResult() {
        return this.overallResult;
    }
    
    public void setOverallResult(String overallResult) {
        this.overallResult = overallResult;
    }

    public String getRiskLevel() {
        return this.riskLevel;
    }
    
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Map<String, AuditResultItem> getResults() {
        return this.results;
    }
    
    public void setResults(Map<String, AuditResultItem> results) {
        this.results = results;
    }

    public TextAuditVO getTextResult() {
        return this.textResult;
    }
    
    public void setTextResult(TextAuditVO textResult) {
        this.textResult = textResult;
    }

    public List<ImageAuditVO> getImageResults() {
        return this.imageResults;
    }
    
    public void setImageResults(List<ImageAuditVO> imageResults) {
        this.imageResults = imageResults;
    }

    public VideoAuditVO getVideoResult() {
        return this.videoResult;
    }
    
    public void setVideoResult(VideoAuditVO videoResult) {
        this.videoResult = videoResult;
    }

    public AudioAuditVO getAudioResult() {
        return this.audioResult;
    }
    
    public void setAudioResult(AudioAuditVO audioResult) {
        this.audioResult = audioResult;
    }

    public String getSuggestion() {
        return this.suggestion;
    }
    
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
