package com.sdkwork.app.model;

public class BlockCheckVO {
    private String createdAt;
    private String updatedAt;
    private Boolean isBlocked;
    private String blockTime;
    private String blockReason;

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

    public Boolean getIsBlocked() {
        return this.isBlocked;
    }
    
    public void setIsBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public String getBlockTime() {
        return this.blockTime;
    }
    
    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    public String getBlockReason() {
        return this.blockReason;
    }
    
    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }
}
