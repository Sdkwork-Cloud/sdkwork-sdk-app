package com.sdkwork.app.model;

public class ChatMessageVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private Integer sessionId;
    private String content;
    private String type;
    private String format;
    private String status;
    private String senderType;
    private String senderId;
    private String receiverId;
    private Integer quoteMessageId;
    private String thinking;
    private String modelId;
    private Integer responseTime;
    private Integer tokenCount;
    private List<AttachmentVO> attachments;
    private String createTime;
    private String updateTime;

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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSenderType() {
        return this.senderType;
    }
    
    public void setSenderType(String senderType) {
        this.senderType = senderType;
    }

    public String getSenderId() {
        return this.senderId;
    }
    
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return this.receiverId;
    }
    
    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public Integer getQuoteMessageId() {
        return this.quoteMessageId;
    }
    
    public void setQuoteMessageId(Integer quoteMessageId) {
        this.quoteMessageId = quoteMessageId;
    }

    public String getThinking() {
        return this.thinking;
    }
    
    public void setThinking(String thinking) {
        this.thinking = thinking;
    }

    public String getModelId() {
        return this.modelId;
    }
    
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public Integer getResponseTime() {
        return this.responseTime;
    }
    
    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    public Integer getTokenCount() {
        return this.tokenCount;
    }
    
    public void setTokenCount(Integer tokenCount) {
        this.tokenCount = tokenCount;
    }

    public List<AttachmentVO> getAttachments() {
        return this.attachments;
    }
    
    public void setAttachments(List<AttachmentVO> attachments) {
        this.attachments = attachments;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
