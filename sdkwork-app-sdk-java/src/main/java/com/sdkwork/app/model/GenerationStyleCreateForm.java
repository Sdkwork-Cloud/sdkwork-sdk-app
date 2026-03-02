package com.sdkwork.app.model;

public class GenerationStyleCreateForm {
    private String name;
    private String description;
    private String type;
    private Map<String, Object> configParams;
    private Boolean isPublic;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getConfigParams() {
        return this.configParams;
    }
    
    public void setConfigParams(Map<String, Object> configParams) {
        this.configParams = configParams;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }
}
