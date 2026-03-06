package com.sdkwork.app.model;

public class AppPublishReadinessVO {
    private Boolean ready;
    private List<String> missingFields;
    private List<AppStorePublishReadinessVO> stores;

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

    public List<AppStorePublishReadinessVO> getStores() {
        return this.stores;
    }
    
    public void setStores(List<AppStorePublishReadinessVO> stores) {
        this.stores = stores;
    }
}
