package com.sdkwork.app.model;

public class CommentVO {
    private String createdAt;
    private String updatedAt;
    private String commentId;
    private String content;
    private String contentType;
    private Integer contentId;
    private Integer userId;
    private String status;
    private Integer likes;
    private Integer replyCount;
    private Boolean isTop;
    private Integer parentId;

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

    public String getCommentId() {
        return this.commentId;
    }
    
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
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

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getLikes() {
        return this.likes;
    }
    
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getReplyCount() {
        return this.replyCount;
    }
    
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Boolean getIsTop() {
        return this.isTop;
    }
    
    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
