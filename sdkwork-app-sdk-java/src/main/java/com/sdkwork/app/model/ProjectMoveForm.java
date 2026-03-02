package com.sdkwork.app.model;

public class ProjectMoveForm {
    private String projectId;
    private String targetWorkspaceId;
    private String moveReason;
    private Boolean retainMembers;
    private Boolean retainSettings;

    public String getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTargetWorkspaceId() {
        return this.targetWorkspaceId;
    }
    
    public void setTargetWorkspaceId(String targetWorkspaceId) {
        this.targetWorkspaceId = targetWorkspaceId;
    }

    public String getMoveReason() {
        return this.moveReason;
    }
    
    public void setMoveReason(String moveReason) {
        this.moveReason = moveReason;
    }

    public Boolean getRetainMembers() {
        return this.retainMembers;
    }
    
    public void setRetainMembers(Boolean retainMembers) {
        this.retainMembers = retainMembers;
    }

    public Boolean getRetainSettings() {
        return this.retainSettings;
    }
    
    public void setRetainSettings(Boolean retainSettings) {
        this.retainSettings = retainSettings;
    }
}
