package com.sdkwork.app.model;

public class RecommendationVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String type;
    private String title;
    private String description;
    private String icon;
    private String image;
    private String url;
    private Double rating;
    private Integer hotScore;
    private String reason;
    private List<String> scenarios;
    private List<String> tags;
    private Boolean isFree;
    private String price;
    private Integer priority;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
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

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public Double getRating() {
        return this.rating;
    }
    
    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getHotScore() {
        return this.hotScore;
    }
    
    public void setHotScore(Integer hotScore) {
        this.hotScore = hotScore;
    }

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<String> getScenarios() {
        return this.scenarios;
    }
    
    public void setScenarios(List<String> scenarios) {
        this.scenarios = scenarios;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Boolean getIsFree() {
        return this.isFree;
    }
    
    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getPriority() {
        return this.priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
