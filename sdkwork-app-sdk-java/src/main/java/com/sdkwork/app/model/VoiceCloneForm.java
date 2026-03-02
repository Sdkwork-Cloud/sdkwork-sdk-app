package com.sdkwork.app.model;

public class VoiceCloneForm {
    private String sampleAudioUrl;
    private String text;
    private String model;
    private String format;

    public String getSampleAudioUrl() {
        return this.sampleAudioUrl;
    }
    
    public void setSampleAudioUrl(String sampleAudioUrl) {
        this.sampleAudioUrl = sampleAudioUrl;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }
}
