package com.sdkwork.app.model;

public class GenerationStyleDetailVO {
    private String createdAt;
    private String updatedAt;
    private String styleId;
    private String name;
    private String description;
    private String type;
    private Map<String, Object> configParams;
    private TagsContent tags;
    private ImageMediaResource coverImage;
    private AssetMediaResourceList assets;
    private ImageMediaResource previewImage;
    private Boolean isPublic;
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

    public String getStyleId() {
        return this.styleId;
    }
    
    public void setStyleId(String styleId) {
        this.styleId = styleId;
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

    public TagsContent getTags() {
        return this.tags;
    }
    
    public void setTags(TagsContent tags) {
        this.tags = tags;
    }

    public ImageMediaResource getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(ImageMediaResource coverImage) {
        this.coverImage = coverImage;
    }

    public AssetMediaResourceList getAssets() {
        return this.assets;
    }
    
    public void setAssets(AssetMediaResourceList assets) {
        this.assets = assets;
    }

    public ImageMediaResource getPreviewImage() {
        return this.previewImage;
    }
    
    public void setPreviewImage(ImageMediaResource previewImage) {
        this.previewImage = previewImage;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
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
