package com.sdkwork.app.model;

public class FollowUserVO {
    private String createdAt;
    private String updatedAt;
    private String userId;
    private String username;
    private String nickname;
    private String avatar;
    private String followTime;
    private Boolean isMutual;

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

    public String getFollowTime() {
        return this.followTime;
    }
    
    public void setFollowTime(String followTime) {
        this.followTime = followTime;
    }

    public Boolean getIsMutual() {
        return this.isMutual;
    }
    
    public void setIsMutual(Boolean isMutual) {
        this.isMutual = isMutual;
    }
}
