package com.sdkwork.app.model;

public class ImageOcrAuditForm {
    private String imageUrl;
    private String contentId;
    private List<String> checkTypes;
    private String language;
    private Boolean returnFullText;

    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public List<String> getCheckTypes() {
        return this.checkTypes;
    }
    
    public void setCheckTypes(List<String> checkTypes) {
        this.checkTypes = checkTypes;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getReturnFullText() {
        return this.returnFullText;
    }
    
    public void setReturnFullText(Boolean returnFullText) {
        this.returnFullText = returnFullText;
    }
}
