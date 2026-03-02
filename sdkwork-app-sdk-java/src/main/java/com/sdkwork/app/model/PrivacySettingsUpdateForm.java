package com.sdkwork.app.model;

public class PrivacySettingsUpdateForm {
    private Boolean dataCollectionEnabled;
    private Boolean personalizedRecommendationsEnabled;
    private Boolean thirdPartyAnalyticsEnabled;
    private Boolean notificationsEnabled;
    private Boolean usageDataSharingEnabled;
    private Boolean autoSaveEnabled;
    private Integer dataRetentionDays;
    private Boolean aiLearningEnabled;

    public Boolean getDataCollectionEnabled() {
        return this.dataCollectionEnabled;
    }
    
    public void setDataCollectionEnabled(Boolean dataCollectionEnabled) {
        this.dataCollectionEnabled = dataCollectionEnabled;
    }

    public Boolean getPersonalizedRecommendationsEnabled() {
        return this.personalizedRecommendationsEnabled;
    }
    
    public void setPersonalizedRecommendationsEnabled(Boolean personalizedRecommendationsEnabled) {
        this.personalizedRecommendationsEnabled = personalizedRecommendationsEnabled;
    }

    public Boolean getThirdPartyAnalyticsEnabled() {
        return this.thirdPartyAnalyticsEnabled;
    }
    
    public void setThirdPartyAnalyticsEnabled(Boolean thirdPartyAnalyticsEnabled) {
        this.thirdPartyAnalyticsEnabled = thirdPartyAnalyticsEnabled;
    }

    public Boolean getNotificationsEnabled() {
        return this.notificationsEnabled;
    }
    
    public void setNotificationsEnabled(Boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    public Boolean getUsageDataSharingEnabled() {
        return this.usageDataSharingEnabled;
    }
    
    public void setUsageDataSharingEnabled(Boolean usageDataSharingEnabled) {
        this.usageDataSharingEnabled = usageDataSharingEnabled;
    }

    public Boolean getAutoSaveEnabled() {
        return this.autoSaveEnabled;
    }
    
    public void setAutoSaveEnabled(Boolean autoSaveEnabled) {
        this.autoSaveEnabled = autoSaveEnabled;
    }

    public Integer getDataRetentionDays() {
        return this.dataRetentionDays;
    }
    
    public void setDataRetentionDays(Integer dataRetentionDays) {
        this.dataRetentionDays = dataRetentionDays;
    }

    public Boolean getAiLearningEnabled() {
        return this.aiLearningEnabled;
    }
    
    public void setAiLearningEnabled(Boolean aiLearningEnabled) {
        this.aiLearningEnabled = aiLearningEnabled;
    }
}
