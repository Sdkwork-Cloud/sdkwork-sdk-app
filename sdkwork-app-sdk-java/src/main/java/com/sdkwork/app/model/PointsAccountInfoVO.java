package com.sdkwork.app.model;

public class PointsAccountInfoVO {
    private String createdAt;
    private String updatedAt;
    private String accountId;
    private String accountType;
    private String accountTypeName;
    private String ownerId;
    private String userId;
    private Integer availablePoints;
    private Integer frozenPoints;
    private Integer totalPoints;
    private Integer tokenBalance;
    private String status;
    private String statusName;
    private Integer pendingPoints;
    private Integer totalEarned;
    private Integer totalSpent;
    private Integer level;
    private String levelName;
    private Integer experience;

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

    public Integer getTotalPoints() {
        return this.totalPoints;
    }
    
    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Integer getTokenBalance() {
        return this.tokenBalance;
    }
    
    public void setTokenBalance(Integer tokenBalance) {
        this.tokenBalance = tokenBalance;
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

    public Integer getPendingPoints() {
        return this.pendingPoints;
    }
    
    public void setPendingPoints(Integer pendingPoints) {
        this.pendingPoints = pendingPoints;
    }

    public Integer getTotalEarned() {
        return this.totalEarned;
    }
    
    public void setTotalEarned(Integer totalEarned) {
        this.totalEarned = totalEarned;
    }

    public Integer getTotalSpent() {
        return this.totalSpent;
    }
    
    public void setTotalSpent(Integer totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Integer getLevel() {
        return this.level;
    }
    
    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelName() {
        return this.levelName;
    }
    
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Integer getExperience() {
        return this.experience;
    }
    
    public void setExperience(Integer experience) {
        this.experience = experience;
    }
}
