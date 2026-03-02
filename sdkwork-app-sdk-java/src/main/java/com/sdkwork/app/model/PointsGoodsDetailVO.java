package com.sdkwork.app.model;

public class PointsGoodsDetailVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String name;
    private String description;
    private List<String> images;
    private String category;
    private Integer points;
    private Integer originalPoints;
    private Integer stock;
    private Boolean exchangeable;
    private Integer limitPerUser;
    private Integer myExchangedCount;
    private String exchangeNote;
    private String validUntil;
    private String usageInstructions;

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

    public List<String> getImages() {
        return this.images;
    }
    
    public void setImages(List<String> images) {
        this.images = images;
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

    public Integer getMyExchangedCount() {
        return this.myExchangedCount;
    }
    
    public void setMyExchangedCount(Integer myExchangedCount) {
        this.myExchangedCount = myExchangedCount;
    }

    public String getExchangeNote() {
        return this.exchangeNote;
    }
    
    public void setExchangeNote(String exchangeNote) {
        this.exchangeNote = exchangeNote;
    }

    public String getValidUntil() {
        return this.validUntil;
    }
    
    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public String getUsageInstructions() {
        return this.usageInstructions;
    }
    
    public void setUsageInstructions(String usageInstructions) {
        this.usageInstructions = usageInstructions;
    }
}
