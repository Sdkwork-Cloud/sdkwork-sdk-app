package com.sdkwork.app.model;

public class FriendRequestVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String fromId;
    private String fromName;
    private String fromAvatar;
    private String toId;
    private String status;
    private String message;

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

    public String getFromId() {
        return this.fromId;
    }
    
    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromName() {
        return this.fromName;
    }
    
    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromAvatar() {
        return this.fromAvatar;
    }
    
    public void setFromAvatar(String fromAvatar) {
        this.fromAvatar = fromAvatar;
    }

    public String getToId() {
        return this.toId;
    }
    
    public void setToId(String toId) {
        this.toId = toId;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
