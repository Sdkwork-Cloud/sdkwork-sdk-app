package com.sdkwork.app.model;

public class ModelInfoDetailVO {
    private String createdAt;
    private String updatedAt;
    private String modelId;
    private String model;
    private String name;
    private String description;
    private String channel;
    private String vendor;
    private String modelType;
    private String family;
    private String version;
    private Boolean openSource;
    private String apiEndpoint;
    private String ownedBy;
    private SceneContent scenes;
    private TagsContent tags;
    private ModelLimitInfo limitInfo;
    private ModelPrice priceInfo;
    private ModelMetadata metadata;
    private Double defaultTemperature;
    private Double defaultTopP;
    private Double defaultFrequencyPenalty;
    private Double defaultPresencePenalty;
    private String status;
    private Integer usageCount;
    private Integer totalTokens;
    private Integer avgResponseTime;

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

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
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

    public String getVendor() {
        return this.vendor;
    }
    
    public void setVendor(String vendor) {
        this.vendor = vendor;
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

    public String getApiEndpoint() {
        return this.apiEndpoint;
    }
    
    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    public String getOwnedBy() {
        return this.ownedBy;
    }
    
    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public SceneContent getScenes() {
        return this.scenes;
    }
    
    public void setScenes(SceneContent scenes) {
        this.scenes = scenes;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public ModelLimitInfo getLimitInfo() {
        return this.limitInfo;
    }
    
    public void setLimitInfo(ModelLimitInfo limitInfo) {
        this.limitInfo = limitInfo;
    }

    public ModelPrice getPriceInfo() {
        return this.priceInfo;
    }
    
    public void setPriceInfo(ModelPrice priceInfo) {
        this.priceInfo = priceInfo;
    }

    public ModelMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(ModelMetadata metadata) {
        this.metadata = metadata;
    }

    public Double getDefaultTemperature() {
        return this.defaultTemperature;
    }
    
    public void setDefaultTemperature(Double defaultTemperature) {
        this.defaultTemperature = defaultTemperature;
    }

    public Double getDefaultTopP() {
        return this.defaultTopP;
    }
    
    public void setDefaultTopP(Double defaultTopP) {
        this.defaultTopP = defaultTopP;
    }

    public Double getDefaultFrequencyPenalty() {
        return this.defaultFrequencyPenalty;
    }
    
    public void setDefaultFrequencyPenalty(Double defaultFrequencyPenalty) {
        this.defaultFrequencyPenalty = defaultFrequencyPenalty;
    }

    public Double getDefaultPresencePenalty() {
        return this.defaultPresencePenalty;
    }
    
    public void setDefaultPresencePenalty(Double defaultPresencePenalty) {
        this.defaultPresencePenalty = defaultPresencePenalty;
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

    public Integer getTotalTokens() {
        return this.totalTokens;
    }
    
    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    public Integer getAvgResponseTime() {
        return this.avgResponseTime;
    }
    
    public void setAvgResponseTime(Integer avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
    }
}
