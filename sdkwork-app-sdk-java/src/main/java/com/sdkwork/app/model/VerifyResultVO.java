package com.sdkwork.app.model;

public class VerifyResultVO {
    private String createdAt;
    private String updatedAt;
    private Boolean valid;

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
}
