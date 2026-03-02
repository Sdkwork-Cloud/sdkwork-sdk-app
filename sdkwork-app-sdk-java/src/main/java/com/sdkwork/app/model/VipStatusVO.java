package com.sdkwork.app.model;

public class VipStatusVO {
    private Boolean isVip;
    private Integer vipLevel;
    private String expireTime;
    private Integer pointBalance;

    public Boolean getIsVip() {
        return this.isVip;
    }
    
    public void setIsVip(Boolean isVip) {
        this.isVip = isVip;
    }

    public Integer getVipLevel() {
        return this.vipLevel;
    }
    
    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getPointBalance() {
        return this.pointBalance;
    }
    
    public void setPointBalance(Integer pointBalance) {
        this.pointBalance = pointBalance;
    }
}
