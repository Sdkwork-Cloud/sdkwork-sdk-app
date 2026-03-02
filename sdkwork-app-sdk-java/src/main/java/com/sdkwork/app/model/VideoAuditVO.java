package com.sdkwork.app.model;

public class VideoAuditVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String status;
    private String videoUrl;
    private Integer duration;
    private String result;
    private String riskLevel;
    private List<KeyFrameResult> keyFrameResults;
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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }
    
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
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

    public List<KeyFrameResult> getKeyFrameResults() {
        return this.keyFrameResults;
    }
    
    public void setKeyFrameResults(List<KeyFrameResult> keyFrameResults) {
        this.keyFrameResults = keyFrameResults;
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
