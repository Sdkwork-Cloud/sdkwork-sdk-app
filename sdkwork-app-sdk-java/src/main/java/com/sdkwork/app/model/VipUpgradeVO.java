package com.sdkwork.app.model;

public class VipUpgradeVO {
    private String price;
    private String targetLevel;
    private String upgradeUrl;
    private String discount;

    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }

    public String getTargetLevel() {
        return this.targetLevel;
    }
    
    public void setTargetLevel(String targetLevel) {
        this.targetLevel = targetLevel;
    }

    public String getUpgradeUrl() {
        return this.upgradeUrl;
    }
    
    public void setUpgradeUrl(String upgradeUrl) {
        this.upgradeUrl = upgradeUrl;
    }

    public String getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
