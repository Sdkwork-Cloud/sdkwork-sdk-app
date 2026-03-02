package com.sdkwork.app.model;

public class CashRechargeForm {
    private Double amount;
    private String paymentMethod;
    private String remarks;
    private String couponId;

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCouponId() {
        return this.couponId;
    }
    
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
