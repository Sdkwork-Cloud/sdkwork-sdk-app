package com.sdkwork.app.model;

public class UserSettingsVO {
    private String createdAt;
    private String updatedAt;
    private String theme;
    private String language;
    private NotificationSettingsVO notificationSettings;
    private PrivacySettingsVO privacySettings;

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

    public String getTheme() {
        return this.theme;
    }
    
    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public NotificationSettingsVO getNotificationSettings() {
        return this.notificationSettings;
    }
    
    public void setNotificationSettings(NotificationSettingsVO notificationSettings) {
        this.notificationSettings = notificationSettings;
    }

    public PrivacySettingsVO getPrivacySettings() {
        return this.privacySettings;
    }
    
    public void setPrivacySettings(PrivacySettingsVO privacySettings) {
        this.privacySettings = privacySettings;
    }
}
