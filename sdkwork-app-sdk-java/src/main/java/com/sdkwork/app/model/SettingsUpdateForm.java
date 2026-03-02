package com.sdkwork.app.model;

public class SettingsUpdateForm {
    private Map<String, Object> settings;
    private String module;
    private Boolean overwrite;

    public Map<String, Object> getSettings() {
        return this.settings;
    }
    
    public void setSettings(Map<String, Object> settings) {
        this.settings = settings;
    }

    public String getModule() {
        return this.module;
    }
    
    public void setModule(String module) {
        this.module = module;
    }

    public Boolean getOverwrite() {
        return this.overwrite;
    }
    
    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }
}
