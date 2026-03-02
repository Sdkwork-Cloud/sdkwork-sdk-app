package com.sdkwork.app.model;

public class VipLevelVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private Integer levelValue;
    private Integer requiredPoints;
    private String description;
    private String icon;
    private String badge;

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

    public Integer getLevelValue() {
        return this.levelValue;
    }
    
    public void setLevelValue(Integer levelValue) {
        this.levelValue = levelValue;
    }

    public Integer getRequiredPoints() {
        return this.requiredPoints;
    }
    
    public void setRequiredPoints(Integer requiredPoints) {
        this.requiredPoints = requiredPoints;
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

    public String getBadge() {
        return this.badge;
    }
    
    public void setBadge(String badge) {
        this.badge = badge;
    }
}
