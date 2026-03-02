package com.sdkwork.app.model;

public class VoiceSpeakerItem {
    private String speakerId;
    private String speakerName;
    private String description;
    private String previewAudioUrl;
    private String gender;
    private String ageRange;
    private String language;
    private String style;
    private Boolean favorite;
    private String createdAt;

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

    public Boolean getFavorite() {
        return this.favorite;
    }
    
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
