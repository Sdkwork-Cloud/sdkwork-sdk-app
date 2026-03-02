package com.sdkwork.app.model;

public class OrderStatusVO {
    private String orderId;
    private String status;
    private String statusName;
    private Integer expireTime;

    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        return this.statusName;
    }
    
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Integer getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }
}
