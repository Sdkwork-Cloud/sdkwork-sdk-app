package com.sdkwork.app.model;

public class ProjectCopyRequest {
    private String targetWorkspaceId;
    private String newName;

    public String getTargetWorkspaceId() {
        return this.targetWorkspaceId;
    }
    
    public void setTargetWorkspaceId(String targetWorkspaceId) {
        this.targetWorkspaceId = targetWorkspaceId;
    }

    public String getNewName() {
        return this.newName;
    }
    
    public void setNewName(String newName) {
        this.newName = newName;
    }
}
