package com.sdkwork.app.model;

public class VoiceSpeakerCloneForm {
    private String sampleAudioUrl;
    private String speakerName;
    private String language;
    private String model;

    public String getSampleAudioUrl() {
        return this.sampleAudioUrl;
    }
    
    public void setSampleAudioUrl(String sampleAudioUrl) {
        this.sampleAudioUrl = sampleAudioUrl;
    }

    public String getSpeakerName() {
        return this.speakerName;
    }
    
    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
}
