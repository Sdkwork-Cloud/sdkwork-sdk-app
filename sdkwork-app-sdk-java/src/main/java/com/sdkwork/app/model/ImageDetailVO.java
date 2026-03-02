package com.sdkwork.app.model;

public class ImageDetailVO {
    private String createdAt;
    private String updatedAt;
    private String imageId;
    private String title;
    private String description;
    private String url;
    private String format;
    private Integer width;
    private Integer height;
    private String aspectRatio;
    private Integer fileSize;
    private ImageMediaResource resource;
    private AuthorInfo author;
    private String status;
    private Boolean isPublic;
    private Boolean isFavorite;
    private Integer viewCount;
    private Integer downloadCount;
    private Integer likeCount;

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

    public String getImageId() {
        return this.imageId;
    }
    
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getWidth() {
        return this.width;
    }
    
    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return this.height;
    }
    
    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getAspectRatio() {
        return this.aspectRatio;
    }
    
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public ImageMediaResource getResource() {
        return this.resource;
    }
    
    public void setResource(ImageMediaResource resource) {
        this.resource = resource;
    }

    public AuthorInfo getAuthor() {
        return this.author;
    }
    
    public void setAuthor(AuthorInfo author) {
        this.author = author;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getIsFavorite() {
        return this.isFavorite;
    }
    
    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Integer getViewCount() {
        return this.viewCount;
    }
    
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getDownloadCount() {
        return this.downloadCount;
    }
    
    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }
    
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }
}
