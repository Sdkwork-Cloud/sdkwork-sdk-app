package com.sdkwork.app.model;

public class ConversationVO {
    private String createdAt;
    private String updatedAt;
    private String conversationId;
    private String conversationType;
    private String otherUserId;
    private String otherUsername;
    private String otherNickname;
    private String otherAvatar;
    private String lastMessage;
    private String lastMessageTime;
    private Integer unreadCount;
    private Boolean isTop;

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

    public String getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getConversationType() {
        return this.conversationType;
    }
    
    public void setConversationType(String conversationType) {
        this.conversationType = conversationType;
    }

    public String getOtherUserId() {
        return this.otherUserId;
    }
    
    public void setOtherUserId(String otherUserId) {
        this.otherUserId = otherUserId;
    }

    public String getOtherUsername() {
        return this.otherUsername;
    }
    
    public void setOtherUsername(String otherUsername) {
        this.otherUsername = otherUsername;
    }

    public String getOtherNickname() {
        return this.otherNickname;
    }
    
    public void setOtherNickname(String otherNickname) {
        this.otherNickname = otherNickname;
    }

    public String getOtherAvatar() {
        return this.otherAvatar;
    }
    
    public void setOtherAvatar(String otherAvatar) {
        this.otherAvatar = otherAvatar;
    }

    public String getLastMessage() {
        return this.lastMessage;
    }
    
    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getLastMessageTime() {
        return this.lastMessageTime;
    }
    
    public void setLastMessageTime(String lastMessageTime) {
        this.lastMessageTime = lastMessageTime;
    }

    public Integer getUnreadCount() {
        return this.unreadCount;
    }
    
    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    public Boolean getIsTop() {
        return this.isTop;
    }
    
    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }
}
