package com.sdkwork.app.model;

public class AppUpdateForm {
    private String name;
    private String description;
    private String accessUrl;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccessUrl() {
        return this.accessUrl;
    }
    
    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }
}
