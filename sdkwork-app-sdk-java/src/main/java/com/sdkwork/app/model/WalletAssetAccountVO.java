package com.sdkwork.app.model;

public class WalletAssetAccountVO {
    private String createdAt;
    private String updatedAt;
    private String accountId;
    private String accountType;
    private String accountTypeName;
    private String status;
    private String statusName;
    private Double availableBalance;
    private Double frozenBalance;
    private Integer availablePoints;
    private Integer frozenPoints;
    private Integer availableToken;
    private Integer frozenToken;

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

    public String getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountTypeName() {
        return this.accountTypeName;
    }
    
    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        return this.statusName;
    }
    
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Double getAvailableBalance() {
        return this.availableBalance;
    }
    
    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Double getFrozenBalance() {
        return this.frozenBalance;
    }
    
    public void setFrozenBalance(Double frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public Integer getAvailablePoints() {
        return this.availablePoints;
    }
    
    public void setAvailablePoints(Integer availablePoints) {
        this.availablePoints = availablePoints;
    }

    public Integer getFrozenPoints() {
        return this.frozenPoints;
    }
    
    public void setFrozenPoints(Integer frozenPoints) {
        this.frozenPoints = frozenPoints;
    }

    public Integer getAvailableToken() {
        return this.availableToken;
    }
    
    public void setAvailableToken(Integer availableToken) {
        this.availableToken = availableToken;
    }

    public Integer getFrozenToken() {
        return this.frozenToken;
    }
    
    public void setFrozenToken(Integer frozenToken) {
        this.frozenToken = frozenToken;
    }
}
