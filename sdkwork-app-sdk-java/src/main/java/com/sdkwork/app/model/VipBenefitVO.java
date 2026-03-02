package com.sdkwork.app.model;

public class VipBenefitVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private String benefitKey;
    private String type;
    private String description;
    private String icon;
    private Boolean claimed;
    private Integer usageLimit;
    private Integer usedCount;

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

    public String getBenefitKey() {
        return this.benefitKey;
    }
    
    public void setBenefitKey(String benefitKey) {
        this.benefitKey = benefitKey;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
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

    public Boolean getClaimed() {
        return this.claimed;
    }
    
    public void setClaimed(Boolean claimed) {
        this.claimed = claimed;
    }

    public Integer getUsageLimit() {
        return this.usageLimit;
    }
    
    public void setUsageLimit(Integer usageLimit) {
        this.usageLimit = usageLimit;
    }

    public Integer getUsedCount() {
        return this.usedCount;
    }
    
    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }
}
