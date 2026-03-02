package com.sdkwork.app.model;

public class PointsGoodsVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String name;
    private String image;
    private String category;
    private Integer points;
    private Integer originalPoints;
    private Integer stock;
    private Boolean exchangeable;
    private Integer limitPerUser;
    private Integer exchangedCount;
    private List<String> tags;
    private Integer sortWeight;

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

    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPoints() {
        return this.points;
    }
    
    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getOriginalPoints() {
        return this.originalPoints;
    }
    
    public void setOriginalPoints(Integer originalPoints) {
        this.originalPoints = originalPoints;
    }

    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getExchangeable() {
        return this.exchangeable;
    }
    
    public void setExchangeable(Boolean exchangeable) {
        this.exchangeable = exchangeable;
    }

    public Integer getLimitPerUser() {
        return this.limitPerUser;
    }
    
    public void setLimitPerUser(Integer limitPerUser) {
        this.limitPerUser = limitPerUser;
    }

    public Integer getExchangedCount() {
        return this.exchangedCount;
    }
    
    public void setExchangedCount(Integer exchangedCount) {
        this.exchangedCount = exchangedCount;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getSortWeight() {
        return this.sortWeight;
    }
    
    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }
}
