package com.sdkwork.app.model;

public class BlockedUserVO {
    private String createdAt;
    private String updatedAt;
    private String userId;
    private String username;
    private String nickname;
    private String avatar;
    private String blockTime;
    private String blockReason;

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

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBlockTime() {
        return this.blockTime;
    }
    
    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    public String getBlockReason() {
        return this.blockReason;
    }
    
    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }
}
