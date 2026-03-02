package com.sdkwork.app.model;

public class SendMessageForm {
    private String recipientId;
    private String content;
    private String messageType;
    private String conversationId;
    private String attachmentUrl;

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

    public String getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getAttachmentUrl() {
        return this.attachmentUrl;
    }
    
    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }
}
