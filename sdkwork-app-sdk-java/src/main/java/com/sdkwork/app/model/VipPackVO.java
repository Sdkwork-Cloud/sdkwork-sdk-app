package com.sdkwork.app.model;

public class VipPackVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Double originalPrice;
    private Integer pointAmount;
    private Integer vipDurationDays;
    private String levelName;
    private Integer sortWeight;
    private Boolean recommended;
    private List<String> tags;

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

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getOriginalPrice() {
        return this.originalPrice;
    }
    
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getPointAmount() {
        return this.pointAmount;
    }
    
    public void setPointAmount(Integer pointAmount) {
        this.pointAmount = pointAmount;
    }

    public Integer getVipDurationDays() {
        return this.vipDurationDays;
    }
    
    public void setVipDurationDays(Integer vipDurationDays) {
        this.vipDurationDays = vipDurationDays;
    }

    public String getLevelName() {
        return this.levelName;
    }
    
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Integer getSortWeight() {
        return this.sortWeight;
    }
    
    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }

    public Boolean getRecommended() {
        return this.recommended;
    }
    
    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
