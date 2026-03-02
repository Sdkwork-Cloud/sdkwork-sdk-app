package com.sdkwork.app.model;

public class WorkspaceSettings {
    private Boolean isPublic;
    private Boolean allowInvite;
    private Boolean allowCreateProject;
    private Boolean allowFileUpload;

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getAllowInvite() {
        return this.allowInvite;
    }
    
    public void setAllowInvite(Boolean allowInvite) {
        this.allowInvite = allowInvite;
    }

    public Boolean getAllowCreateProject() {
        return this.allowCreateProject;
    }
    
    public void setAllowCreateProject(Boolean allowCreateProject) {
        this.allowCreateProject = allowCreateProject;
    }

    public Boolean getAllowFileUpload() {
        return this.allowFileUpload;
    }
    
    public void setAllowFileUpload(Boolean allowFileUpload) {
        this.allowFileUpload = allowFileUpload;
    }
}
