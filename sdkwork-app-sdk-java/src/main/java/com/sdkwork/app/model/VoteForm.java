package com.sdkwork.app.model;

public class VoteForm {
    private String contentType;
    private Integer contentId;
    private String rating;
    private String source;
    private String deviceInfo;

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getRating() {
        return this.rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }

    public String getDeviceInfo() {
        return this.deviceInfo;
    }
    
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }
}
