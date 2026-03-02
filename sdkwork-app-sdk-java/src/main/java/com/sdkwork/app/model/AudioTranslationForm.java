package com.sdkwork.app.model;

public class AudioTranslationForm {
    private String audioUrl;
    private String targetLanguage;
    private String model;
    private String sourceLanguage;
    private String format;

    public String getAudioUrl() {
        return this.audioUrl;
    }
    
    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }
    
    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getSourceLanguage() {
        return this.sourceLanguage;
    }
    
    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }
}
