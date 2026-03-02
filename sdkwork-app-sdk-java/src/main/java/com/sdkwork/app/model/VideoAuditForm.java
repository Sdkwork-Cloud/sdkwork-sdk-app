package com.sdkwork.app.model;

public class VideoAuditForm {
    private String videoUrl;
    private String contentId;
    private String title;
    private String description;
    private String contentType;
    private List<String> checkTypes;
    private String callbackUrl;
    private Integer duration;

    public String getVideoUrl() {
        return this.videoUrl;
    }
    
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public List<String> getCheckTypes() {
        return this.checkTypes;
    }
    
    public void setCheckTypes(List<String> checkTypes) {
        this.checkTypes = checkTypes;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
