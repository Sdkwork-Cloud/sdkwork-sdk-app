package com.sdkwork.app.model;

public class CouponStatisticsVO {
    private Integer totalCoupons;
    private Integer unusedCount;
    private Integer usedCount;
    private Integer expiredCount;

    public Integer getTotalCoupons() {
        return this.totalCoupons;
    }
    
    public void setTotalCoupons(Integer totalCoupons) {
        this.totalCoupons = totalCoupons;
    }

    public Integer getUnusedCount() {
        return this.unusedCount;
    }
    
    public void setUnusedCount(Integer unusedCount) {
        this.unusedCount = unusedCount;
    }

    public Integer getUsedCount() {
        return this.usedCount;
    }
    
    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    public Integer getExpiredCount() {
        return this.expiredCount;
    }
    
    public void setExpiredCount(Integer expiredCount) {
        this.expiredCount = expiredCount;
    }
}
