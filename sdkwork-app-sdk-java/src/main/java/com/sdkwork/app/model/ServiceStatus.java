package com.sdkwork.app.model;

public class ServiceStatus {
    private String api;
    private String database;
    private String cache;
    private String storage;
    private String thirdParty;

    public String getApi() {
        return this.api;
    }
    
    public void setApi(String api) {
        this.api = api;
    }

    public String getDatabase() {
        return this.database;
    }
    
    public void setDatabase(String database) {
        this.database = database;
    }

    public String getCache() {
        return this.cache;
    }
    
    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getStorage() {
        return this.storage;
    }
    
    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getThirdParty() {
        return this.thirdParty;
    }
    
    public void setThirdParty(String thirdParty) {
        this.thirdParty = thirdParty;
    }
}
