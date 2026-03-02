package com.sdkwork.app.model;

public class ReportDetailVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String type;
    private String targetId;
    private String content;
    private String attachmentUrl;
    private String screenshotUrl;
    private String status;
    private String submitTime;
    private String processTime;
    private String processResult;

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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubmitTime() {
        return this.submitTime;
    }
    
    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getProcessTime() {
        return this.processTime;
    }
    
    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }

    public String getProcessResult() {
        return this.processResult;
    }
    
    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }
}
