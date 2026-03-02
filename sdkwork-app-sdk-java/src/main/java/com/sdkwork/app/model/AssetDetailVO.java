package com.sdkwork.app.model;

public class AssetDetailVO {
    private String createdAt;
    private String updatedAt;
    private String assetId;
    private String assetName;
    private String assetType;
    private String fileType;
    private String fileTypeName;
    private String mimeType;
    private Integer size;
    private String description;
    private List<String> tags;
    private String folderId;
    private String status;
    private String statusName;
    private ImageMediaResource coverImage;
    private List<AssetMediaResource> assets;
    private String primaryUrl;
    private String thumbnailUrl;
    private String diskId;
    private String path;
    private String versionId;
    private Integer downloadCount;
    private Boolean favorited;
    private String author;
    private String extension;

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

    public String getFileTypeName() {
        return this.fileTypeName;
    }
    
    public void setFileTypeName(String fileTypeName) {
        this.fileTypeName = fileTypeName;
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

    public String getStatusName() {
        return this.statusName;
    }
    
    public void setStatusName(String statusName) {
        this.statusName = statusName;
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

    public String getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }

    public String getVersionId() {
        return this.versionId;
    }
    
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public Integer getDownloadCount() {
        return this.downloadCount;
    }
    
    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Boolean getFavorited() {
        return this.favorited;
    }
    
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getExtension() {
        return this.extension;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }
}
