package com.sdkwork.app.model;

public class UserSettingsUpdateForm {
    private NotificationSettings notificationSettings;
    private PrivacySettings privacySettings;
    private String language;
    private String theme;
    private Boolean autoPlay;
    private Boolean highQuality;
    private Boolean dataSaver;
    private DownloadSettings downloadSettings;

    public NotificationSettings getNotificationSettings() {
        return this.notificationSettings;
    }
    
    public void setNotificationSettings(NotificationSettings notificationSettings) {
        this.notificationSettings = notificationSettings;
    }

    public PrivacySettings getPrivacySettings() {
        return this.privacySettings;
    }
    
    public void setPrivacySettings(PrivacySettings privacySettings) {
        this.privacySettings = privacySettings;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTheme() {
        return this.theme;
    }
    
    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Boolean getAutoPlay() {
        return this.autoPlay;
    }
    
    public void setAutoPlay(Boolean autoPlay) {
        this.autoPlay = autoPlay;
    }

    public Boolean getHighQuality() {
        return this.highQuality;
    }
    
    public void setHighQuality(Boolean highQuality) {
        this.highQuality = highQuality;
    }

    public Boolean getDataSaver() {
        return this.dataSaver;
    }
    
    public void setDataSaver(Boolean dataSaver) {
        this.dataSaver = dataSaver;
    }

    public DownloadSettings getDownloadSettings() {
        return this.downloadSettings;
    }
    
    public void setDownloadSettings(DownloadSettings downloadSettings) {
        this.downloadSettings = downloadSettings;
    }
}
