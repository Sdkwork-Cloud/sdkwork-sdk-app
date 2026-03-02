package com.sdkwork.app.model;

public class PromptEnhanceRequest {
    private String prompt;
    private String scene;
    private String style;
    private String language;
    private Integer maxWords;

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getScene() {
        return this.scene;
    }
    
    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getMaxWords() {
        return this.maxWords;
    }
    
    public void setMaxWords(Integer maxWords) {
        this.maxWords = maxWords;
    }
}
