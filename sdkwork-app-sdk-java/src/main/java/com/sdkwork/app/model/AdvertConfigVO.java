package com.sdkwork.app.model;

public class AdvertConfigVO {
    private String createdAt;
    private String updatedAt;
    private String configId;
    private Boolean enabled;
    private Integer maxAdsPerHour;
    private Integer minInterval;
    private String adNetwork;
    private String apiKey;
    private String status;

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

    public String getConfigId() {
        return this.configId;
    }
    
    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getMaxAdsPerHour() {
        return this.maxAdsPerHour;
    }
    
    public void setMaxAdsPerHour(Integer maxAdsPerHour) {
        this.maxAdsPerHour = maxAdsPerHour;
    }

    public Integer getMinInterval() {
        return this.minInterval;
    }
    
    public void setMinInterval(Integer minInterval) {
        this.minInterval = minInterval;
    }

    public String getAdNetwork() {
        return this.adNetwork;
    }
    
    public void setAdNetwork(String adNetwork) {
        this.adNetwork = adNetwork;
    }

    public String getApiKey() {
        return this.apiKey;
    }
    
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
