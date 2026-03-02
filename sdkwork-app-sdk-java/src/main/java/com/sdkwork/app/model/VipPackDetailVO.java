package com.sdkwork.app.model;

public class VipPackDetailVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Double originalPrice;
    private Integer pointAmount;
    private Integer vipDurationDays;
    private Integer levelId;
    private String levelName;
    private Integer groupId;
    private String groupName;
    private String validFrom;
    private String validTo;
    private Integer sortWeight;
    private List<VipBenefitVO> benefits;

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

    public Integer getLevelId() {
        return this.levelId;
    }
    
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return this.levelName;
    }
    
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Integer getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getValidFrom() {
        return this.validFrom;
    }
    
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return this.validTo;
    }
    
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public Integer getSortWeight() {
        return this.sortWeight;
    }
    
    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }

    public List<VipBenefitVO> getBenefits() {
        return this.benefits;
    }
    
    public void setBenefits(List<VipBenefitVO> benefits) {
        this.benefits = benefits;
    }
}
