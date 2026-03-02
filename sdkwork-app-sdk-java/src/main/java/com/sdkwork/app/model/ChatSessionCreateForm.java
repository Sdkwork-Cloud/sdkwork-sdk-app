package com.sdkwork.app.model;

public class ChatSessionCreateForm {
    private String name;
    private String description;
    private String modelId;
    private String systemPrompt;
    private Double temperature;
    private Integer maxTokens;
    private Double topP;
    private String type;
    private String resourceId;

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

    public String getModelId() {
        return this.modelId;
    }
    
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getSystemPrompt() {
        return this.systemPrompt;
    }
    
    public void setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
    }

    public Double getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getMaxTokens() {
        return this.maxTokens;
    }
    
    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public Double getTopP() {
        return this.topP;
    }
    
    public void setTopP(Double topP) {
        this.topP = topP;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getResourceId() {
        return this.resourceId;
    }
    
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
