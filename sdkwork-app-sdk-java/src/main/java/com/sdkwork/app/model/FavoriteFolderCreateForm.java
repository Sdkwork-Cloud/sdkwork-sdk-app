package com.sdkwork.app.model;

public class FavoriteFolderCreateForm {
    private String folderName;
    private String name;
    private String parentFolderId;
    private String folderDescription;

    public String getFolderName() {
        return this.folderName;
    }
    
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
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
