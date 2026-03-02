package com.sdkwork.app.model;

public class AdvertPositionDetailVO {
    private String createdAt;
    private String updatedAt;
    private String positionId;
    private String positionName;
    private String positionType;
    private String description;
    private Integer priority;
    private Boolean enabled;
    private List<AdvertVO> adverts;

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

    public String getPositionId() {
        return this.positionId;
    }
    
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return this.positionName;
    }
    
    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionType() {
        return this.positionType;
    }
    
    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPriority() {
        return this.priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<AdvertVO> getAdverts() {
        return this.adverts;
    }
    
    public void setAdverts(List<AdvertVO> adverts) {
        this.adverts = adverts;
    }
}
