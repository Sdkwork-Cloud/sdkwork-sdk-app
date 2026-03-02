package com.sdkwork.app.model;

public class VoiceSpeakerGenerationVO {
    private String createdAt;
    private String updatedAt;
    private String taskId;
    private String speakerId;
    private String speakerName;
    private String description;
    private String previewAudioUrl;
    private String gender;
    private String ageRange;
    private String language;
    private String style;
    private String status;
    private Boolean favorite;
    private String completedAt;

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

    public String getSpeakerId() {
        return this.speakerId;
    }
    
    public void setSpeakerId(String speakerId) {
        this.speakerId = speakerId;
    }

    public String getSpeakerName() {
        return this.speakerName;
    }
    
    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreviewAudioUrl() {
        return this.previewAudioUrl;
    }
    
    public void setPreviewAudioUrl(String previewAudioUrl) {
        this.previewAudioUrl = previewAudioUrl;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeRange() {
        return this.ageRange;
    }
    
    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getFavorite() {
        return this.favorite;
    }
    
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public String getCompletedAt() {
        return this.completedAt;
    }
    
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }
}
