package com.sdkwork.app.model;

public class FavoriteFolderUpdateForm {
    private String folderId;
    private String folderName;
    private String parentFolderId;
    private String folderDescription;

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

    public String getParentFolderId() {
        return this.parentFolderId;
    }
    
    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    public String getFolderDescription() {
        return this.folderDescription;
    }
    
    public void setFolderDescription(String folderDescription) {
        this.folderDescription = folderDescription;
    }
}
