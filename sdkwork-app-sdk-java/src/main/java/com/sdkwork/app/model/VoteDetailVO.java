package com.sdkwork.app.model;

public class VoteDetailVO {
    private String createdAt;
    private String updatedAt;
    private String voteId;
    private Integer userId;
    private String contentType;
    private Integer contentId;
    private String rating;
    private String source;
    private String clientIp;
    private String deviceInfo;

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

    public String getVoteId() {
        return this.voteId;
    }
    
    public void setVoteId(String voteId) {
        this.voteId = voteId;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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

    public String getClientIp() {
        return this.clientIp;
    }
    
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getDeviceInfo() {
        return this.deviceInfo;
    }
    
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }
}
