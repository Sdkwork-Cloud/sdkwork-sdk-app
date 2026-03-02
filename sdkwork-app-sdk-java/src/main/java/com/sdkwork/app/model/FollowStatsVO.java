package com.sdkwork.app.model;

public class FollowStatsVO {
    private String createdAt;
    private String updatedAt;
    private Integer followingCount;
    private Integer followersCount;
    private Integer mutualCount;

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

    public Integer getFollowingCount() {
        return this.followingCount;
    }
    
    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public Integer getFollowersCount() {
        return this.followersCount;
    }
    
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Integer getMutualCount() {
        return this.mutualCount;
    }
    
    public void setMutualCount(Integer mutualCount) {
        this.mutualCount = mutualCount;
    }
}
