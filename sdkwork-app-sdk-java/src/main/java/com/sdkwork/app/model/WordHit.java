package com.sdkwork.app.model;

public class WordHit {
    private String word;
    private Integer startIndex;
    private Integer endIndex;
    private String category;
    private String severity;

    public String getWord() {
        return this.word;
    }
    
    public void setWord(String word) {
        this.word = word;
    }

    public Integer getStartIndex() {
        return this.startIndex;
    }
    
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return this.endIndex;
    }
    
    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public String getSeverity() {
        return this.severity;
    }
    
    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
