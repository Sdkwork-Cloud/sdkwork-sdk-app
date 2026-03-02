package com.sdkwork.app.model;

public class ProjectSettings {
    private Boolean isPublic;
    private Boolean allowComments;
    private Boolean allowFileUpload;
    private Boolean allowInviteMembers;

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getAllowComments() {
        return this.allowComments;
    }
    
    public void setAllowComments(Boolean allowComments) {
        this.allowComments = allowComments;
    }

    public Boolean getAllowFileUpload() {
        return this.allowFileUpload;
    }
    
    public void setAllowFileUpload(Boolean allowFileUpload) {
        this.allowFileUpload = allowFileUpload;
    }

    public Boolean getAllowInviteMembers() {
        return this.allowInviteMembers;
    }
    
    public void setAllowInviteMembers(Boolean allowInviteMembers) {
        this.allowInviteMembers = allowInviteMembers;
    }
}
