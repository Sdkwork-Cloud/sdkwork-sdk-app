package com.sdkwork.app.model;

public class SensitiveWordsVO {
    private String createdAt;
    private String updatedAt;
    private Boolean hasSensitiveWords;
    private Integer count;
    private List<WordHit> words;
    private String processedText;
    private String riskLevel;

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

    public Boolean getHasSensitiveWords() {
        return this.hasSensitiveWords;
    }
    
    public void setHasSensitiveWords(Boolean hasSensitiveWords) {
        this.hasSensitiveWords = hasSensitiveWords;
    }

    public Integer getCount() {
        return this.count;
    }
    
    public void setCount(Integer count) {
        this.count = count;
    }

    public List<WordHit> getWords() {
        return this.words;
    }
    
    public void setWords(List<WordHit> words) {
        this.words = words;
    }

    public String getProcessedText() {
        return this.processedText;
    }
    
    public void setProcessedText(String processedText) {
        this.processedText = processedText;
    }

    public String getRiskLevel() {
        return this.riskLevel;
    }
    
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
}
