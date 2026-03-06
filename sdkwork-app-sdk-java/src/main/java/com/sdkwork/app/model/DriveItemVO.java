package com.sdkwork.app.model;

public class DriveItemVO {
    private String createdAt;
    private String updatedAt;
    private String itemId;
    private String itemUuid;
    private String itemName;
    private String fileType;
    private Boolean directory;
    private String assetType;
    private String mimeType;
    private String extension;
    private Integer size;
    private String parentId;
    private String path;
    private String objectKey;
    private String status;
    private Boolean favorited;
    private FileMediaResource resource;
    private ImageMediaResource coverImage;

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

    public String getItemId() {
        return this.itemId;
    }
    
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemUuid() {
        return this.itemUuid;
    }
    
    public void setItemUuid(String itemUuid) {
        this.itemUuid = itemUuid;
    }

    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getFileType() {
        return this.fileType;
    }
    
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Boolean getDirectory() {
        return this.directory;
    }
    
    public void setDirectory(Boolean directory) {
        this.directory = directory;
    }

    public String getAssetType() {
        return this.assetType;
    }
    
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getMimeType() {
        return this.mimeType;
    }
    
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getExtension() {
        return this.extension;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }

    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }

    public String getObjectKey() {
        return this.objectKey;
    }
    
    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getFavorited() {
        return this.favorited;
    }
    
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public FileMediaResource getResource() {
        return this.resource;
    }
    
    public void setResource(FileMediaResource resource) {
        this.resource = resource;
    }

    public ImageMediaResource getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(ImageMediaResource coverImage) {
        this.coverImage = coverImage;
    }
}
