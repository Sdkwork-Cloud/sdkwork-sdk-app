package com.sdkwork.app.model;

public class ContentAuditForm {
    private String contentId;
    private String textContent;
    private List<String> imageUrls;
    private String videoUrl;
    private String audioUrl;
    private String contentType;
    private String scene;
    private List<String> checkTypes;
    private Map<String, Object> metadata;
    private String userId;

    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getTextContent() {
        return this.textContent;
    }
    
    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public List<String> getImageUrls() {
        return this.imageUrls;
    }
    
    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }
    
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getAudioUrl() {
        return this.audioUrl;
    }
    
    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getScene() {
        return this.scene;
    }
    
    public void setScene(String scene) {
        this.scene = scene;
    }

    public List<String> getCheckTypes() {
        return this.checkTypes;
    }
    
    public void setCheckTypes(List<String> checkTypes) {
        this.checkTypes = checkTypes;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
