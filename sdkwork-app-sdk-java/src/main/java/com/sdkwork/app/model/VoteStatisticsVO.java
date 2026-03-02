package com.sdkwork.app.model;

public class VoteStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalVotes;
    private Integer likes;
    private Integer dislikes;
    private Integer neutrals;
    private String likeRatio;

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

    public Integer getTotalVotes() {
        return this.totalVotes;
    }
    
    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Integer getLikes() {
        return this.likes;
    }
    
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return this.dislikes;
    }
    
    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public Integer getNeutrals() {
        return this.neutrals;
    }
    
    public void setNeutrals(Integer neutrals) {
        this.neutrals = neutrals;
    }

    public String getLikeRatio() {
        return this.likeRatio;
    }
    
    public void setLikeRatio(String likeRatio) {
        this.likeRatio = likeRatio;
    }
}
