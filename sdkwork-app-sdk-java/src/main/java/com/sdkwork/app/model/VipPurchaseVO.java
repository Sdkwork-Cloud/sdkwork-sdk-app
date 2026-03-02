package com.sdkwork.app.model;

public class VipPurchaseVO {
    private String createdAt;
    private String updatedAt;
    private String orderId;
    private Integer packId;
    private String packName;
    private Double amount;
    private Integer durationDays;
    private Integer targetLevelId;
    private String targetLevelName;
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

    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getPackId() {
        return this.packId;
    }
    
    public void setPackId(Integer packId) {
        this.packId = packId;
    }

    public String getPackName() {
        return this.packName;
    }
    
    public void setPackName(String packName) {
        this.packName = packName;
    }

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getDurationDays() {
        return this.durationDays;
    }
    
    public void setDurationDays(Integer durationDays) {
        this.durationDays = durationDays;
    }

    public Integer getTargetLevelId() {
        return this.targetLevelId;
    }
    
    public void setTargetLevelId(Integer targetLevelId) {
        this.targetLevelId = targetLevelId;
    }

    public String getTargetLevelName() {
        return this.targetLevelName;
    }
    
    public void setTargetLevelName(String targetLevelName) {
        this.targetLevelName = targetLevelName;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
