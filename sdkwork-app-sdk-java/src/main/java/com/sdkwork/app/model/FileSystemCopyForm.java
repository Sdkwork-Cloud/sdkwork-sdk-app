package com.sdkwork.app.model;

public class FileSystemCopyForm {
    private String targetParentId;
    private String targetDiskId;
    private String name;
    private Boolean copyContent;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCopyContent() {
        return this.copyContent;
    }
    
    public void setCopyContent(Boolean copyContent) {
        this.copyContent = copyContent;
    }
}
