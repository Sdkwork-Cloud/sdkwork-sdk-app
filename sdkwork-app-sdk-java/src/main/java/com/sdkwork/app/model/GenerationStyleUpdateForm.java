package com.sdkwork.app.model;

public class GenerationStyleUpdateForm {
    private String name;
    private String description;
    private Map<String, Object> configParams;

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

    public Map<String, Object> getConfigParams() {
        return this.configParams;
    }
    
    public void setConfigParams(Map<String, Object> configParams) {
        this.configParams = configParams;
    }
}
