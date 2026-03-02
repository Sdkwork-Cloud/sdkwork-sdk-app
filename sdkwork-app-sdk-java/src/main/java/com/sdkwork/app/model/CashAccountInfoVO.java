package com.sdkwork.app.model;

public class CashAccountInfoVO {
    private String createdAt;
    private String updatedAt;
    private String accountId;
    private String accountType;
    private String accountTypeName;
    private String ownerId;
    private String userId;
    private Double availableBalance;
    private Double frozenBalance;
    private Double totalBalance;
    private String status;
    private String statusName;
    private Double pendingBalance;
    private Double totalRecharged;
    private Double totalSpent;
    private Double totalWithdrawn;

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

    public String getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
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

    public Double getTotalBalance() {
        return this.totalBalance;
    }
    
    public void setTotalBalance(Double totalBalance) {
        this.totalBalance = totalBalance;
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

    public Double getPendingBalance() {
        return this.pendingBalance;
    }
    
    public void setPendingBalance(Double pendingBalance) {
        this.pendingBalance = pendingBalance;
    }

    public Double getTotalRecharged() {
        return this.totalRecharged;
    }
    
    public void setTotalRecharged(Double totalRecharged) {
        this.totalRecharged = totalRecharged;
    }

    public Double getTotalSpent() {
        return this.totalSpent;
    }
    
    public void setTotalSpent(Double totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Double getTotalWithdrawn() {
        return this.totalWithdrawn;
    }
    
    public void setTotalWithdrawn(Double totalWithdrawn) {
        this.totalWithdrawn = totalWithdrawn;
    }
}
