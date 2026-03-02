package com.sdkwork.app.model;

public class AudioAsrAuditForm {
    private String audioUrl;
    private String contentId;
    private String language;
    private List<String> checkTypes;
    private Boolean withTimestamp;

    public String getAudioUrl() {
        return this.audioUrl;
    }
    
    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getCheckTypes() {
        return this.checkTypes;
    }
    
    public void setCheckTypes(List<String> checkTypes) {
        this.checkTypes = checkTypes;
    }

    public Boolean getWithTimestamp() {
        return this.withTimestamp;
    }
    
    public void setWithTimestamp(Boolean withTimestamp) {
        this.withTimestamp = withTimestamp;
    }
}
