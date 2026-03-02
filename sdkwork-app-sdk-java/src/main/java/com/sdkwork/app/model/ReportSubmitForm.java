package com.sdkwork.app.model;

public class ReportSubmitForm {
    private String type;
    private String targetId;
    private String content;
    private String attachmentUrl;
    private String screenshotUrl;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getTargetId() {
        return this.targetId;
    }
    
    public void setTargetId(String targetId) {
        this.targetId = targetId;
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

    public String getScreenshotUrl() {
        return this.screenshotUrl;
    }
    
    public void setScreenshotUrl(String screenshotUrl) {
        this.screenshotUrl = screenshotUrl;
    }
}
