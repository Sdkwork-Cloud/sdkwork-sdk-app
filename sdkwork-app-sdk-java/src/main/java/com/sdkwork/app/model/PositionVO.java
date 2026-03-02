package com.sdkwork.app.model;

public class PositionVO {
    private String createdAt;
    private String updatedAt;
    private String name;
    private String code;
    private String description;
    private Integer ownerId;
    private Integer parentId;
    private Integer level;
    private Boolean isActive;
    private Integer sortOrder;
    private String category;
    private String levelName;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return this.level;
    }
    
    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getSortOrder() {
        return this.sortOrder;
    }
    
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public String getLevelName() {
        return this.levelName;
    }
    
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }
}
