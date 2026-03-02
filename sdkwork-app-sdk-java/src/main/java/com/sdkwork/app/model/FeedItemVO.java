package com.sdkwork.app.model;

public class FeedItemVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String title;
    private String content;
    private String summary;
    private String coverImage;
    private String contentType;
    private List<String> tags;
    private AuthorInfo author;
    private Integer viewCount;
    private Integer likeCount;
    private Integer commentCount;
    private Integer shareCount;
    private Boolean isLiked;
    private Boolean isCollected;

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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public AuthorInfo getAuthor() {
        return this.author;
    }
    
    public void setAuthor(AuthorInfo author) {
        this.author = author;
    }

    public Integer getViewCount() {
        return this.viewCount;
    }
    
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }
    
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }
    
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getShareCount() {
        return this.shareCount;
    }
    
    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Boolean getIsLiked() {
        return this.isLiked;
    }
    
    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    public Boolean getIsCollected() {
        return this.isCollected;
    }
    
    public void setIsCollected(Boolean isCollected) {
        this.isCollected = isCollected;
    }
}
