package com.sdkwork.app.model;

public class AdvertSettingsVO {
    private String createdAt;
    private String updatedAt;
    private Boolean enabled;
    private Boolean personalized;
    private Integer maxDailyAds;
    private String adBlockLevel;
    private Boolean rewardVideoEnabled;
    private Boolean interstitialEnabled;
    private Boolean bannerEnabled;
    private String lastUpdated;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getPersonalized() {
        return this.personalized;
    }
    
    public void setPersonalized(Boolean personalized) {
        this.personalized = personalized;
    }

    public Integer getMaxDailyAds() {
        return this.maxDailyAds;
    }
    
    public void setMaxDailyAds(Integer maxDailyAds) {
        this.maxDailyAds = maxDailyAds;
    }

    public String getAdBlockLevel() {
        return this.adBlockLevel;
    }
    
    public void setAdBlockLevel(String adBlockLevel) {
        this.adBlockLevel = adBlockLevel;
    }

    public Boolean getRewardVideoEnabled() {
        return this.rewardVideoEnabled;
    }
    
    public void setRewardVideoEnabled(Boolean rewardVideoEnabled) {
        this.rewardVideoEnabled = rewardVideoEnabled;
    }

    public Boolean getInterstitialEnabled() {
        return this.interstitialEnabled;
    }
    
    public void setInterstitialEnabled(Boolean interstitialEnabled) {
        this.interstitialEnabled = interstitialEnabled;
    }

    public Boolean getBannerEnabled() {
        return this.bannerEnabled;
    }
    
    public void setBannerEnabled(Boolean bannerEnabled) {
        this.bannerEnabled = bannerEnabled;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }
    
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
