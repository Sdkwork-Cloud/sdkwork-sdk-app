package com.sdkwork.app.model;

public class VoteVO {
    private String createdAt;
    private String updatedAt;
    private String voteId;
    private String contentType;
    private Integer contentId;
    private String rating;

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

    public String getVoteId() {
        return this.voteId;
    }
    
    public void setVoteId(String voteId) {
        this.voteId = voteId;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getContentId() {
        return this.contentId;
    }
    
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getRating() {
        return this.rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }
}
