package com.sdkwork.app.model;

public class FeedbackFollowUpForm {
    private String feedbackId;
    private String content;
    private String attachmentUrl;

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
}
