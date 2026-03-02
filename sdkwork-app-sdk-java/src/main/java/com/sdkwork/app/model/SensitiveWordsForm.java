package com.sdkwork.app.model;

public class SensitiveWordsForm {
    private String text;
    private String wordListType;
    private String mode;
    private String replacement;
    private List<String> categories;

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public String getWordListType() {
        return this.wordListType;
    }
    
    public void setWordListType(String wordListType) {
        this.wordListType = wordListType;
    }

    public String getMode() {
        return this.mode;
    }
    
    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getReplacement() {
        return this.replacement;
    }
    
    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    public List<String> getCategories() {
        return this.categories;
    }
    
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
}
