package com.sdkwork.app.model;

public class DriveFolderCreateForm {
    private String name;
    private String parentId;
    private String diskId;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }
}
