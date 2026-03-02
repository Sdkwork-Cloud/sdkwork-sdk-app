package com.sdkwork.app.model;

public class LotteryPrizeVO {
    private String createdAt;
    private String updatedAt;
    private String recordId;
    private String lotteryId;
    private String lotteryTitle;
    private String prizeId;
    private String prizeName;
    private String prizeImage;
    private String prizeType;
    private Boolean isGrandPrize;
    private String winTime;
    private String claimStatus;
    private String claimTime;
    private String expireTime;
    private Boolean canClaim;

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

    public String getRecordId() {
        return this.recordId;
    }
    
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getLotteryId() {
        return this.lotteryId;
    }
    
    public void setLotteryId(String lotteryId) {
        this.lotteryId = lotteryId;
    }

    public String getLotteryTitle() {
        return this.lotteryTitle;
    }
    
    public void setLotteryTitle(String lotteryTitle) {
        this.lotteryTitle = lotteryTitle;
    }

    public String getPrizeId() {
        return this.prizeId;
    }
    
    public void setPrizeId(String prizeId) {
        this.prizeId = prizeId;
    }

    public String getPrizeName() {
        return this.prizeName;
    }
    
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getPrizeImage() {
        return this.prizeImage;
    }
    
    public void setPrizeImage(String prizeImage) {
        this.prizeImage = prizeImage;
    }

    public String getPrizeType() {
        return this.prizeType;
    }
    
    public void setPrizeType(String prizeType) {
        this.prizeType = prizeType;
    }

    public Boolean getIsGrandPrize() {
        return this.isGrandPrize;
    }
    
    public void setIsGrandPrize(Boolean isGrandPrize) {
        this.isGrandPrize = isGrandPrize;
    }

    public String getWinTime() {
        return this.winTime;
    }
    
    public void setWinTime(String winTime) {
        this.winTime = winTime;
    }

    public String getClaimStatus() {
        return this.claimStatus;
    }
    
    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getClaimTime() {
        return this.claimTime;
    }
    
    public void setClaimTime(String claimTime) {
        this.claimTime = claimTime;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public Boolean getCanClaim() {
        return this.canClaim;
    }
    
    public void setCanClaim(Boolean canClaim) {
        this.canClaim = canClaim;
    }
}
