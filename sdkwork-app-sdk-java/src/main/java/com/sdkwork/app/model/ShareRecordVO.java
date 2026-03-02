package com.sdkwork.app.model;

public class ShareRecordVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String shareId;
    private String shareType;
    private String title;
    private String createTime;
    private String expireTime;
    private String status;
    private Integer visitCount;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getShareId() {
        return this.shareId;
    }
    
    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getShareType() {
        return this.shareType;
    }
    
    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getVisitCount() {
        return this.visitCount;
    }
    
    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }
}
