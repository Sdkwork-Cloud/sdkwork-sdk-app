package com.sdkwork.app.model;

public class RankInfoVO {
    private String createdAt;
    private String updatedAt;
    private Integer rank;
    private String userId;
    private String username;
    private Integer score;
    private String avatar;
    private Boolean isCurrentUser;

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

    public Integer getRank() {
        return this.rank;
    }
    
    public void setRank(Integer rank) {
        this.rank = rank;
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

    public Integer getScore() {
        return this.score;
    }
    
    public void setScore(Integer score) {
        this.score = score;
    }

    public String getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getIsCurrentUser() {
        return this.isCurrentUser;
    }
    
    public void setIsCurrentUser(Boolean isCurrentUser) {
        this.isCurrentUser = isCurrentUser;
    }
}
