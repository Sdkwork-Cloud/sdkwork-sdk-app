package com.sdkwork.app.model;

public class VoiceListVO {
    private String createdAt;
    private String updatedAt;
    private List<VoiceItem> voices;

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

    public List<VoiceItem> getVoices() {
        return this.voices;
    }
    
    public void setVoices(List<VoiceItem> voices) {
        this.voices = voices;
    }
}
