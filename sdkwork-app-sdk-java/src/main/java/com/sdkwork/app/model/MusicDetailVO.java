package com.sdkwork.app.model;

public class MusicDetailVO {
    private String createdAt;
    private String updatedAt;
    private String musicId;
    private String title;
    private String description;
    private String contentUrl;
    private String format;
    private Integer duration;
    private String artist;
    private String genre;
    private Integer bitrate;
    private Integer fileSize;
    private String thumbnailUrl;
    private ImageMediaResourceList coverImages;
    private MusicMediaResource resource;
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

    public String getMusicId() {
        return this.musicId;
    }
    
    public void setMusicId(String musicId) {
        this.musicId = musicId;
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

    public String getArtist() {
        return this.artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getBitrate() {
        return this.bitrate;
    }
    
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
    
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public ImageMediaResourceList getCoverImages() {
        return this.coverImages;
    }
    
    public void setCoverImages(ImageMediaResourceList coverImages) {
        this.coverImages = coverImages;
    }

    public MusicMediaResource getResource() {
        return this.resource;
    }
    
    public void setResource(MusicMediaResource resource) {
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
