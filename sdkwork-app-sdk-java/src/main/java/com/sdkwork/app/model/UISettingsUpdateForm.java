package com.sdkwork.app.model;

public class UISettingsUpdateForm {
    private String theme;
    private String language;
    private String fontSize;
    private Integer zoomLevel;
    private Boolean notificationsEnabled;
    private Boolean shortcutsEnabled;
    private String sidebarState;
    private Boolean autoSaveEnabled;

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

    public String getFontSize() {
        return this.fontSize;
    }
    
    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public Integer getZoomLevel() {
        return this.zoomLevel;
    }
    
    public void setZoomLevel(Integer zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    public Boolean getNotificationsEnabled() {
        return this.notificationsEnabled;
    }
    
    public void setNotificationsEnabled(Boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    public Boolean getShortcutsEnabled() {
        return this.shortcutsEnabled;
    }
    
    public void setShortcutsEnabled(Boolean shortcutsEnabled) {
        this.shortcutsEnabled = shortcutsEnabled;
    }

    public String getSidebarState() {
        return this.sidebarState;
    }
    
    public void setSidebarState(String sidebarState) {
        this.sidebarState = sidebarState;
    }

    public Boolean getAutoSaveEnabled() {
        return this.autoSaveEnabled;
    }
    
    public void setAutoSaveEnabled(Boolean autoSaveEnabled) {
        this.autoSaveEnabled = autoSaveEnabled;
    }
}
