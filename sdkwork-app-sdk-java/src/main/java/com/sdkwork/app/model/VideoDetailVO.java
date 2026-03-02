package com.sdkwork.app.model;

public class VideoDetailVO {
    private String createdAt;
    private String updatedAt;
    private String videoId;
    private String title;
    private String description;
    private String contentUrl;
    private String format;
    private Integer duration;
    private String thumbnailUrl;
    private Integer width;
    private Integer height;
    private String aspectRatio;
    private String resolution;
    private Integer fileSize;
    private Integer categoryId;
    private ImageMediaResourceList coverImages;
    private VideoMediaResource resource;
    private AuthorInfo author;
    private String status;
    private Boolean isPublic;
    private Boolean isFavorite;
    private Integer playCount;
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

    public String getVideoId() {
        return this.videoId;
    }
    
    public void setVideoId(String videoId) {
        this.videoId = videoId;
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

    public String getContentUrl() {
        return this.contentUrl;
    }
    
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
    
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
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

    public String getResolution() {
        return this.resolution;
    }
    
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public ImageMediaResourceList getCoverImages() {
        return this.coverImages;
    }
    
    public void setCoverImages(ImageMediaResourceList coverImages) {
        this.coverImages = coverImages;
    }

    public VideoMediaResource getResource() {
        return this.resource;
    }
    
    public void setResource(VideoMediaResource resource) {
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

    public Integer getPlayCount() {
        return this.playCount;
    }
    
    public void setPlayCount(Integer playCount) {
        this.playCount = playCount;
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
