package com.sdkwork.app.model;

public class ContactQueryForm {
    private String keyword;
    private String region;
    private Boolean isOnline;

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getIsOnline() {
        return this.isOnline;
    }
    
    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }
}
