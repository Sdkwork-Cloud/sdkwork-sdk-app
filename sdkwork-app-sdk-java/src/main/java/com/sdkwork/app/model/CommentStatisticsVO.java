package com.sdkwork.app.model;

public class CommentStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalComments;

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

    public Integer getTotalComments() {
        return this.totalComments;
    }
    
    public void setTotalComments(Integer totalComments) {
        this.totalComments = totalComments;
    }
}
