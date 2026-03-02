package com.sdkwork.app.model;

public class TextSuggestForm {
    private String text;
    private String suggestType;
    private String scene;

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public String getSuggestType() {
        return this.suggestType;
    }
    
    public void setSuggestType(String suggestType) {
        this.suggestType = suggestType;
    }

    public String getScene() {
        return this.scene;
    }
    
    public void setScene(String scene) {
        this.scene = scene;
    }
}
