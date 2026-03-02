package com.sdkwork.app.model;

public class VipPackGroupQueryForm {
    private Integer vipLevelId;
    private Boolean recommendedOnly;

    public Integer getVipLevelId() {
        return this.vipLevelId;
    }
    
    public void setVipLevelId(Integer vipLevelId) {
        this.vipLevelId = vipLevelId;
    }

    public Boolean getRecommendedOnly() {
        return this.recommendedOnly;
    }
    
    public void setRecommendedOnly(Boolean recommendedOnly) {
        this.recommendedOnly = recommendedOnly;
    }
}
