package com.sdkwork.app.model;

public class UserLevelVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String name;
    private String icon;
    private String description;
    private Integer level;
    private Integer currentExp;
    private Integer requiredExp;
    private Double expProgress;
    private List<PrivilegeVO> privileges;
    private String validUntil;
    private String status;

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

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return this.level;
    }
    
    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCurrentExp() {
        return this.currentExp;
    }
    
    public void setCurrentExp(Integer currentExp) {
        this.currentExp = currentExp;
    }

    public Integer getRequiredExp() {
        return this.requiredExp;
    }
    
    public void setRequiredExp(Integer requiredExp) {
        this.requiredExp = requiredExp;
    }

    public Double getExpProgress() {
        return this.expProgress;
    }
    
    public void setExpProgress(Double expProgress) {
        this.expProgress = expProgress;
    }

    public List<PrivilegeVO> getPrivileges() {
        return this.privileges;
    }
    
    public void setPrivileges(List<PrivilegeVO> privileges) {
        this.privileges = privileges;
    }

    public String getValidUntil() {
        return this.validUntil;
    }
    
    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
