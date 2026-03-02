package com.sdkwork.app.model;

public class FileSystemNodeVO {
    private String createdAt;
    private String updatedAt;
    private String nodeId;
    private String nodeUuid;
    private String name;
    private String type;
    private Boolean directory;
    private String diskId;
    private String parentId;
    private String path;
    private String relativePath;
    private String objectKey;
    private Integer size;
    private String mimeType;
    private String extension;
    private String assetType;
    private String status;
    private String description;
    private List<String> tags;
    private String versionId;
    private String uploadStatus;

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

    public String getNodeId() {
        return this.nodeId;
    }
    
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeUuid() {
        return this.nodeUuid;
    }
    
    public void setNodeUuid(String nodeUuid) {
        this.nodeUuid = nodeUuid;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Boolean getDirectory() {
        return this.directory;
    }
    
    public void setDirectory(Boolean directory) {
        this.directory = directory;
    }

    public String getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(String diskId) {
        this.diskId = diskId;
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

    public String getRelativePath() {
        return this.relativePath;
    }
    
    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public String getObjectKey() {
        return this.objectKey;
    }
    
    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
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

    public String getAssetType() {
        return this.assetType;
    }
    
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
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

    public String getVersionId() {
        return this.versionId;
    }
    
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getUploadStatus() {
        return this.uploadStatus;
    }
    
    public void setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
    }
}
