package com.sdkwork.app.model;

public class FileSystemMoveForm {
    private String targetParentId;
    private String targetDiskId;

    public String getTargetParentId() {
        return this.targetParentId;
    }
    
    public void setTargetParentId(String targetParentId) {
        this.targetParentId = targetParentId;
    }

    public String getTargetDiskId() {
        return this.targetDiskId;
    }
    
    public void setTargetDiskId(String targetDiskId) {
        this.targetDiskId = targetDiskId;
    }
}
