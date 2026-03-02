package com.sdkwork.app.model;

public class TextSuggestVO {
    private String createdAt;
    private String updatedAt;
    private String originalText;
    private String suggestedText;
    private Integer replacementCount;
    private List<ReplacementPosition> positions;
    private List<String> alternativeSuggestions;

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

    public String getOriginalText() {
        return this.originalText;
    }
    
    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public String getSuggestedText() {
        return this.suggestedText;
    }
    
    public void setSuggestedText(String suggestedText) {
        this.suggestedText = suggestedText;
    }

    public Integer getReplacementCount() {
        return this.replacementCount;
    }
    
    public void setReplacementCount(Integer replacementCount) {
        this.replacementCount = replacementCount;
    }

    public List<ReplacementPosition> getPositions() {
        return this.positions;
    }
    
    public void setPositions(List<ReplacementPosition> positions) {
        this.positions = positions;
    }

    public List<String> getAlternativeSuggestions() {
        return this.alternativeSuggestions;
    }
    
    public void setAlternativeSuggestions(List<String> alternativeSuggestions) {
        this.alternativeSuggestions = alternativeSuggestions;
    }
}
