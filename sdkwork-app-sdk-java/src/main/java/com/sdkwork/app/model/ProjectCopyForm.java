package com.sdkwork.app.model;

public class ProjectCopyForm {
    private String sourceProjectId;
    private String targetWorkspaceId;
    private String newName;
    private String newProjectDescription;
    private Boolean copyMembers;
    private Boolean copyFiles;
    private Boolean copySettings;
    private String copyReason;

    public String getSourceProjectId() {
        return this.sourceProjectId;
    }
    
    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

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

    public String getNewProjectDescription() {
        return this.newProjectDescription;
    }
    
    public void setNewProjectDescription(String newProjectDescription) {
        this.newProjectDescription = newProjectDescription;
    }

    public Boolean getCopyMembers() {
        return this.copyMembers;
    }
    
    public void setCopyMembers(Boolean copyMembers) {
        this.copyMembers = copyMembers;
    }

    public Boolean getCopyFiles() {
        return this.copyFiles;
    }
    
    public void setCopyFiles(Boolean copyFiles) {
        this.copyFiles = copyFiles;
    }

    public Boolean getCopySettings() {
        return this.copySettings;
    }
    
    public void setCopySettings(Boolean copySettings) {
        this.copySettings = copySettings;
    }

    public String getCopyReason() {
        return this.copyReason;
    }
    
    public void setCopyReason(String copyReason) {
        this.copyReason = copyReason;
    }
}
