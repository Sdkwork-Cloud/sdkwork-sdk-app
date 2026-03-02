package com.sdkwork.app.model;

public class ShopStatisticsVO {
    private Integer totalShops;
    private Integer activeShops;
    private Integer inactiveShops;

    public Integer getTotalShops() {
        return this.totalShops;
    }
    
    public void setTotalShops(Integer totalShops) {
        this.totalShops = totalShops;
    }

    public Integer getActiveShops() {
        return this.activeShops;
    }
    
    public void setActiveShops(Integer activeShops) {
        this.activeShops = activeShops;
    }

    public Integer getInactiveShops() {
        return this.inactiveShops;
    }
    
    public void setInactiveShops(Integer inactiveShops) {
        this.inactiveShops = inactiveShops;
    }
}
