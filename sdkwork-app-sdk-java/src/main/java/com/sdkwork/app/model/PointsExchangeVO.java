package com.sdkwork.app.model;

public class PointsExchangeVO {
    private String createdAt;
    private String updatedAt;
    private String recordId;
    private Boolean success;
    private String goodsName;
    private Integer pointsCost;
    private Integer remainingPoints;
    private Integer quantity;
    private String exchangeTime;
    private String status;
    private String rewardContent;
    private String message;

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

    public String getRecordId() {
        return this.recordId;
    }
    
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getGoodsName() {
        return this.goodsName;
    }
    
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getPointsCost() {
        return this.pointsCost;
    }
    
    public void setPointsCost(Integer pointsCost) {
        this.pointsCost = pointsCost;
    }

    public Integer getRemainingPoints() {
        return this.remainingPoints;
    }
    
    public void setRemainingPoints(Integer remainingPoints) {
        this.remainingPoints = remainingPoints;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getExchangeTime() {
        return this.exchangeTime;
    }
    
    public void setExchangeTime(String exchangeTime) {
        this.exchangeTime = exchangeTime;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getRewardContent() {
        return this.rewardContent;
    }
    
    public void setRewardContent(String rewardContent) {
        this.rewardContent = rewardContent;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
