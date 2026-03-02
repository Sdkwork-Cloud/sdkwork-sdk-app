package com.sdkwork.app.model;

public class UiConfigVO {
    private String createdAt;
    private String updatedAt;
    private String configKey;
    private String configName;
    private Map<String, Object> uiConfig;
    private String version;

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

    public String getConfigKey() {
        return this.configKey;
    }
    
    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public String getConfigName() {
        return this.configName;
    }
    
    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public Map<String, Object> getUiConfig() {
        return this.uiConfig;
    }
    
    public void setUiConfig(Map<String, Object> uiConfig) {
        this.uiConfig = uiConfig;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
}
