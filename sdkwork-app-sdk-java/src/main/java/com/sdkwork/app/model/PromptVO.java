package com.sdkwork.app.model;

public class PromptVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String title;
    private String content;
    private String type;
    private String bizType;
    private String description;
    private Integer cateId;
    private Boolean enabled;
    private Integer sort;
    private Map<String, Object> parameters;
    private String creator;
    private String model;
    private TagsContent tags;
    private Integer usageCount;
    private Integer avgResponseTime;
    private String version;
    private Boolean isPublic;
    private Boolean isFavorite;
    private Integer favoriteCount;
    private String lastUsedAt;

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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getBizType() {
        return this.bizType;
    }
    
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCateId() {
        return this.cateId;
    }
    
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }
    
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public String getCreator() {
        return this.creator;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public Integer getUsageCount() {
        return this.usageCount;
    }
    
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public Integer getAvgResponseTime() {
        return this.avgResponseTime;
    }
    
    public void setAvgResponseTime(Integer avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getIsFavorite() {
        return this.isFavorite;
    }
    
    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Integer getFavoriteCount() {
        return this.favoriteCount;
    }
    
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public String getLastUsedAt() {
        return this.lastUsedAt;
    }
    
    public void setLastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }
}
