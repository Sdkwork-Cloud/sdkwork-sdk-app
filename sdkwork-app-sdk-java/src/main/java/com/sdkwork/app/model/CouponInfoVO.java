package com.sdkwork.app.model;

public class CouponInfoVO {
    private String couponId;
    private String couponName;
    private String discountAmount;
    private String couponType;

    public String getCouponId() {
        return this.couponId;
    }
    
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return this.couponName;
    }
    
    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getDiscountAmount() {
        return this.discountAmount;
    }
    
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getCouponType() {
        return this.couponType;
    }
    
    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }
}
