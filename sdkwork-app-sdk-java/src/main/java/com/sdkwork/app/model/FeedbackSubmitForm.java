package com.sdkwork.app.model;

public class FeedbackSubmitForm {
    private String type;
    private String content;
    private String contact;
    private String attachmentUrl;
    private String screenshotUrl;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getContact() {
        return this.contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAttachmentUrl() {
        return this.attachmentUrl;
    }
    
    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public String getScreenshotUrl() {
        return this.screenshotUrl;
    }
    
    public void setScreenshotUrl(String screenshotUrl) {
        this.screenshotUrl = screenshotUrl;
    }
}
