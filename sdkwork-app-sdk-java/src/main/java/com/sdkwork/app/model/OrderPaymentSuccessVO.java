package com.sdkwork.app.model;

public class OrderPaymentSuccessVO {
    private String orderId;
    private String outTradeNo;
    private Boolean paid;
    private String status;
    private String statusName;

    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }
    
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Boolean getPaid() {
        return this.paid;
    }
    
    public void setPaid(Boolean paid) {
        this.paid = paid;
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
}
