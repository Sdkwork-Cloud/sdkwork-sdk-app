package com.sdkwork.app.model;

public class MusicVO {
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
    private String thumbnailUrl;
    private String status;
    private Boolean isPublic;
    private Boolean isFavorite;
    private Integer playCount;
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

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
    
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
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

    public Integer getLikeCount() {
        return this.likeCount;
    }
    
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }
}
