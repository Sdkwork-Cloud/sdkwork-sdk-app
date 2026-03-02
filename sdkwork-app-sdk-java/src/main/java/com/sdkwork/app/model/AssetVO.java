package com.sdkwork.app.model;

public class AssetVO {
    private String createdAt;
    private String updatedAt;
    private String assetId;
    private String assetName;
    private String assetType;
    private String fileType;
    private String mimeType;
    private Integer size;
    private String description;
    private List<String> tags;
    private String folderId;
    private String status;
    private ImageMediaResource coverImage;
    private List<AssetMediaResource> assets;
    private String primaryUrl;
    private String thumbnailUrl;

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

    public String getAssetId() {
        return this.assetId;
    }
    
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return this.assetName;
    }
    
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetType() {
        return this.assetType;
    }
    
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getFileType() {
        return this.fileType;
    }
    
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getMimeType() {
        return this.mimeType;
    }
    
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getFolderId() {
        return this.folderId;
    }
    
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public ImageMediaResource getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(ImageMediaResource coverImage) {
        this.coverImage = coverImage;
    }

    public List<AssetMediaResource> getAssets() {
        return this.assets;
    }
    
    public void setAssets(List<AssetMediaResource> assets) {
        this.assets = assets;
    }

    public String getPrimaryUrl() {
        return this.primaryUrl;
    }
    
    public void setPrimaryUrl(String primaryUrl) {
        this.primaryUrl = primaryUrl;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
    
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
