package com.sdkwork.app.model;

public class VipPurchaseForm {
    private Integer packId;
    private String couponId;
    private String paymentMethod;

    public Integer getPackId() {
        return this.packId;
    }
    
    public void setPackId(Integer packId) {
        this.packId = packId;
    }

    public String getCouponId() {
        return this.couponId;
    }
    
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
