package com.sdkwork.app.model;

public class FollowCheckVO {
    private String createdAt;
    private String updatedAt;
    private Boolean isFollowing;
    private String followTime;
    private Boolean isFollowedBy;

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

    public Boolean getIsFollowing() {
        return this.isFollowing;
    }
    
    public void setIsFollowing(Boolean isFollowing) {
        this.isFollowing = isFollowing;
    }

    public String getFollowTime() {
        return this.followTime;
    }
    
    public void setFollowTime(String followTime) {
        this.followTime = followTime;
    }

    public Boolean getIsFollowedBy() {
        return this.isFollowedBy;
    }
    
    public void setIsFollowedBy(Boolean isFollowedBy) {
        this.isFollowedBy = isFollowedBy;
    }
}
