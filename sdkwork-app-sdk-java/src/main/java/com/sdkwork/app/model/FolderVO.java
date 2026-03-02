package com.sdkwork.app.model;

public class FolderVO {
    private String createdAt;
    private String updatedAt;
    private String folderId;
    private String folderName;
    private String parentId;
    private Integer childCount;
    private Integer fileCount;

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

    public String getFolderId() {
        return this.folderId;
    }
    
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getFolderName() {
        return this.folderName;
    }
    
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getChildCount() {
        return this.childCount;
    }
    
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    public Integer getFileCount() {
        return this.fileCount;
    }
    
    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
    }
}
