package com.sdkwork.app.model;

public class PositionCreateForm {
    private String name;
    private String code;
    private String description;
    private Integer ownerId;
    private Integer parentId;
    private Integer level;
    private Integer sortOrder;
    private String category;
    private Integer requiredExperienceYears;
    private String requiredEducation;
    private Integer maxMemberCount;

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

    public Integer getRequiredExperienceYears() {
        return this.requiredExperienceYears;
    }
    
    public void setRequiredExperienceYears(Integer requiredExperienceYears) {
        this.requiredExperienceYears = requiredExperienceYears;
    }

    public String getRequiredEducation() {
        return this.requiredEducation;
    }
    
    public void setRequiredEducation(String requiredEducation) {
        this.requiredEducation = requiredEducation;
    }

    public Integer getMaxMemberCount() {
        return this.maxMemberCount;
    }
    
    public void setMaxMemberCount(Integer maxMemberCount) {
        this.maxMemberCount = maxMemberCount;
    }
}
