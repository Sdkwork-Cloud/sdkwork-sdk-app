package com.sdkwork.app.model;

public class VoiceItem {
    private String voiceId;
    private String name;
    private String description;
    private String language;
    private String gender;
    private String style;
    private String previewAudioUrl;

    public String getVoiceId() {
        return this.voiceId;
    }
    
    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }

    public String getPreviewAudioUrl() {
        return this.previewAudioUrl;
    }
    
    public void setPreviewAudioUrl(String previewAudioUrl) {
        this.previewAudioUrl = previewAudioUrl;
    }
}
