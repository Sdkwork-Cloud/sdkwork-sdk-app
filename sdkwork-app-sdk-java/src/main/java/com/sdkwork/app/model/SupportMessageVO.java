package com.sdkwork.app.model;

public class SupportMessageVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String sessionId;
    private String content;
    private String attachmentUrl;
    private String senderType;
    private String sendTime;
    private Boolean read;

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

    public String getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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

    public String getSenderType() {
        return this.senderType;
    }
    
    public void setSenderType(String senderType) {
        this.senderType = senderType;
    }

    public String getSendTime() {
        return this.sendTime;
    }
    
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public Boolean getRead() {
        return this.read;
    }
    
    public void setRead(Boolean read) {
        this.read = read;
    }
}
