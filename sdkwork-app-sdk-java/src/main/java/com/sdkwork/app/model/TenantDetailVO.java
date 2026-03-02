package com.sdkwork.app.model;

public class TenantDetailVO {
    private String createdAt;
    private String updatedAt;
    private String name;
    private String code;
    private String type;
    private String bizType;
    private Integer bizId;
    private String status;
    private String description;
    private Integer adminUserId;
    private InstallAppList installAppList;
    private TenantMetadata metadata;
    private String contactPerson;
    private String contactPhone;
    private Integer tokenExpirationMs;
    private Integer refreshTokenExpirationMs;
    private String expireTime;

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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getBizType() {
        return this.bizType;
    }
    
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public Integer getBizId() {
        return this.bizId;
    }
    
    public void setBizId(Integer bizId) {
        this.bizId = bizId;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAdminUserId() {
        return this.adminUserId;
    }
    
    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
    }

    public InstallAppList getInstallAppList() {
        return this.installAppList;
    }
    
    public void setInstallAppList(InstallAppList installAppList) {
        this.installAppList = installAppList;
    }

    public TenantMetadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(TenantMetadata metadata) {
        this.metadata = metadata;
    }

    public String getContactPerson() {
        return this.contactPerson;
    }
    
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }
    
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Integer getTokenExpirationMs() {
        return this.tokenExpirationMs;
    }
    
    public void setTokenExpirationMs(Integer tokenExpirationMs) {
        this.tokenExpirationMs = tokenExpirationMs;
    }

    public Integer getRefreshTokenExpirationMs() {
        return this.refreshTokenExpirationMs;
    }
    
    public void setRefreshTokenExpirationMs(Integer refreshTokenExpirationMs) {
        this.refreshTokenExpirationMs = refreshTokenExpirationMs;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }
}
