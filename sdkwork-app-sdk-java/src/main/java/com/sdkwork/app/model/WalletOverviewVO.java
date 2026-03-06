package com.sdkwork.app.model;

public class WalletOverviewVO {
    private String createdAt;
    private String updatedAt;
    private String userId;
    private String snapshotAt;
    private Double cashAvailable;
    private Double cashFrozen;
    private Integer pointsAvailable;
    private Integer pointsFrozen;
    private Integer tokenAvailable;
    private Integer tokenFrozen;
    private List<WalletAssetAccountVO> accounts;

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

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSnapshotAt() {
        return this.snapshotAt;
    }
    
    public void setSnapshotAt(String snapshotAt) {
        this.snapshotAt = snapshotAt;
    }

    public Double getCashAvailable() {
        return this.cashAvailable;
    }
    
    public void setCashAvailable(Double cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    public Double getCashFrozen() {
        return this.cashFrozen;
    }
    
    public void setCashFrozen(Double cashFrozen) {
        this.cashFrozen = cashFrozen;
    }

    public Integer getPointsAvailable() {
        return this.pointsAvailable;
    }
    
    public void setPointsAvailable(Integer pointsAvailable) {
        this.pointsAvailable = pointsAvailable;
    }

    public Integer getPointsFrozen() {
        return this.pointsFrozen;
    }
    
    public void setPointsFrozen(Integer pointsFrozen) {
        this.pointsFrozen = pointsFrozen;
    }

    public Integer getTokenAvailable() {
        return this.tokenAvailable;
    }
    
    public void setTokenAvailable(Integer tokenAvailable) {
        this.tokenAvailable = tokenAvailable;
    }

    public Integer getTokenFrozen() {
        return this.tokenFrozen;
    }
    
    public void setTokenFrozen(Integer tokenFrozen) {
        this.tokenFrozen = tokenFrozen;
    }

    public List<WalletAssetAccountVO> getAccounts() {
        return this.accounts;
    }
    
    public void setAccounts(List<WalletAssetAccountVO> accounts) {
        this.accounts = accounts;
    }
}
