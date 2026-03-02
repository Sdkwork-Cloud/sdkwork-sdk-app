package com.sdkwork.app.model;

public class PrivateMessageVO {
    private String createdAt;
    private String updatedAt;
    private String messageId;
    private String senderId;
    private String recipientId;
    private String content;
    private String messageType;
    private String sendTime;
    private Boolean isRead;
    private String attachmentUrl;

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

    public String getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getSenderId() {
        return this.senderId;
    }
    
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getRecipientId() {
        return this.recipientId;
    }
    
    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getMessageType() {
        return this.messageType;
    }
    
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getSendTime() {
        return this.sendTime;
    }
    
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public Boolean getIsRead() {
        return this.isRead;
    }
    
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public String getAttachmentUrl() {
        return this.attachmentUrl;
    }
    
    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }
}
