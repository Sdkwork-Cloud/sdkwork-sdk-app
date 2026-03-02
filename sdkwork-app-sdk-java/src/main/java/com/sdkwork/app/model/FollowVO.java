package com.sdkwork.app.model;

public class FollowVO {
    private String createdAt;
    private String updatedAt;
    private Boolean success;
    private Boolean isFollowing;
    private String userId;

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

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getIsFollowing() {
        return this.isFollowing;
    }
    
    public void setIsFollowing(Boolean isFollowing) {
        this.isFollowing = isFollowing;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
