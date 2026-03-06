package com.sdkwork.app.model;

public class ModelInfoVO {
    private String createdAt;
    private String updatedAt;
    private String modelId;
    private String modelKey;
    private String model;
    private String vendorModel;
    private String name;
    private String description;
    private String channel;
    private String modelType;
    private String family;
    private String version;
    private Boolean openSource;
    private String status;
    private Integer usageCount;

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

    public String getModelId() {
        return this.modelId;
    }
    
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getModelKey() {
        return this.modelKey;
    }
    
    public void setModelKey(String modelKey) {
        this.modelKey = modelKey;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getVendorModel() {
        return this.vendorModel;
    }
    
    public void setVendorModel(String vendorModel) {
        this.vendorModel = vendorModel;
    }

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

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getModelType() {
        return this.modelType;
    }
    
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getFamily() {
        return this.family;
    }
    
    public void setFamily(String family) {
        this.family = family;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getOpenSource() {
        return this.openSource;
    }
    
    public void setOpenSource(Boolean openSource) {
        this.openSource = openSource;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUsageCount() {
        return this.usageCount;
    }
    
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }
}
