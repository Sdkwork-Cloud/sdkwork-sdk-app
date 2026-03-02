package com.sdkwork.app.model;

public class TrendingItemVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String name;
    private String description;
    private String icon;
    private String cover;
    private String type;
    private String url;
    private Integer hotScore;
    private Double rating;
    private Integer downloads;
    private Integer favorites;
    private Integer comments;
    private String author;
    private List<String> tags;
    private String price;
    private Boolean isFree;
    private String updateTime;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCover() {
        return this.cover;
    }
    
    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getHotScore() {
        return this.hotScore;
    }
    
    public void setHotScore(Integer hotScore) {
        this.hotScore = hotScore;
    }

    public Double getRating() {
        return this.rating;
    }
    
    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getDownloads() {
        return this.downloads;
    }
    
    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Integer getFavorites() {
        return this.favorites;
    }
    
    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    public Integer getComments() {
        return this.comments;
    }
    
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }

    public Boolean getIsFree() {
        return this.isFree;
    }
    
    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
