package com.sdkwork.app.model;

public class ShareVerifyVO {
    private String createdAt;
    private String updatedAt;
    private Boolean valid;
    private String errorMessage;
    private ShareInfoVO shareInfo;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getValid() {
        return this.valid;
    }
    
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ShareInfoVO getShareInfo() {
        return this.shareInfo;
    }
    
    public void setShareInfo(ShareInfoVO shareInfo) {
        this.shareInfo = shareInfo;
    }
}
