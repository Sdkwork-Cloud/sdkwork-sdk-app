package com.sdkwork.app.model;

public class VipUpgradeForm {
    private Integer targetLevelId;
    private String couponId;
    private String paymentMethod;

    public Integer getTargetLevelId() {
        return this.targetLevelId;
    }
    
    public void setTargetLevelId(Integer targetLevelId) {
        this.targetLevelId = targetLevelId;
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
