package com.sdkwork.app.model;

public class PaymentReconcileForm {
    private String orderId;
    private String outTradeNo;
    private String reconcileType;

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

    public String getReconcileType() {
        return this.reconcileType;
    }
    
    public void setReconcileType(String reconcileType) {
        this.reconcileType = reconcileType;
    }
}
