package com.sdkwork.app.model;

public class FeedbackFollowUpVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String feedbackId;
    private String content;
    private String attachmentUrl;
    private String followUpTime;
    private String follower;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getFeedbackId() {
        return this.feedbackId;
    }
    
    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getAttachmentUrl() {
        return this.attachmentUrl;
    }
    
    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public String getFollowUpTime() {
        return this.followUpTime;
    }
    
    public void setFollowUpTime(String followUpTime) {
        this.followUpTime = followUpTime;
    }

    public String getFollower() {
        return this.follower;
    }
    
    public void setFollower(String follower) {
        this.follower = follower;
    }
}
