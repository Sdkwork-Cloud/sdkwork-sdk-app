package com.sdkwork.app.model;

public class AppStorePublishReadinessVO {
    private String platform;
    private Boolean ready;
    private List<String> missingFields;

    public String getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Boolean getReady() {
        return this.ready;
    }
    
    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public List<String> getMissingFields() {
        return this.missingFields;
    }
    
    public void setMissingFields(List<String> missingFields) {
        this.missingFields = missingFields;
    }
}
