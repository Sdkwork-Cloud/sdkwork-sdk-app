package com.sdkwork.app.model;

public class OrderStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalOrders;
    private Integer pendingPayment;
    private Integer pendingShipment;
    private Integer pendingReceipt;
    private Integer completed;
    private String totalAmount;

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

    public Integer getTotalOrders() {
        return this.totalOrders;
    }
    
    public void setTotalOrders(Integer totalOrders) {
        this.totalOrders = totalOrders;
    }

    public Integer getPendingPayment() {
        return this.pendingPayment;
    }
    
    public void setPendingPayment(Integer pendingPayment) {
        this.pendingPayment = pendingPayment;
    }

    public Integer getPendingShipment() {
        return this.pendingShipment;
    }
    
    public void setPendingShipment(Integer pendingShipment) {
        this.pendingShipment = pendingShipment;
    }

    public Integer getPendingReceipt() {
        return this.pendingReceipt;
    }
    
    public void setPendingReceipt(Integer pendingReceipt) {
        this.pendingReceipt = pendingReceipt;
    }

    public Integer getCompleted() {
        return this.completed;
    }
    
    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
}
