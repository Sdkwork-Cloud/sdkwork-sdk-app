package com.sdkwork.app.model;

public class PointsExchangeRecordVO {
    private String createdAt;
    private String updatedAt;
    private String recordId;
    private String goodsId;
    private String goodsName;
    private String goodsImage;
    private Integer quantity;
    private Integer pointsCost;
    private String exchangeTime;
    private String status;
    private String deliverTime;
    private String logisticsInfo;
    private String remark;

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

    public String getGoodsId() {
        return this.goodsId;
    }
    
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return this.goodsName;
    }
    
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImage() {
        return this.goodsImage;
    }
    
    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPointsCost() {
        return this.pointsCost;
    }
    
    public void setPointsCost(Integer pointsCost) {
        this.pointsCost = pointsCost;
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

    public String getDeliverTime() {
        return this.deliverTime;
    }
    
    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
    }

    public String getLogisticsInfo() {
        return this.logisticsInfo;
    }
    
    public void setLogisticsInfo(String logisticsInfo) {
        this.logisticsInfo = logisticsInfo;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
