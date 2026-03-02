package com.sdkwork.app.model;

public class VoteStatusVO {
    private String createdAt;
    private String updatedAt;
    private Boolean hasVoted;
    private String userRating;

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

    public Boolean getHasVoted() {
        return this.hasVoted;
    }
    
    public void setHasVoted(Boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    public String getUserRating() {
        return this.userRating;
    }
    
    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }
}
