package com.sdkwork.app.model;

public class LotteryDrawVO {
    private String createdAt;
    private String updatedAt;
    private Boolean isWin;
    private String prizeId;
    private String prizeName;
    private String prizeImage;
    private String prizeType;
    private Boolean isGrandPrize;
    private String winTime;
    private String recordId;
    private Integer remainingFreeCount;
    private Integer pointsCost;
    private String message;

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

    public Boolean getIsWin() {
        return this.isWin;
    }
    
    public void setIsWin(Boolean isWin) {
        this.isWin = isWin;
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

    public String getRecordId() {
        return this.recordId;
    }
    
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Integer getRemainingFreeCount() {
        return this.remainingFreeCount;
    }
    
    public void setRemainingFreeCount(Integer remainingFreeCount) {
        this.remainingFreeCount = remainingFreeCount;
    }

    public Integer getPointsCost() {
        return this.pointsCost;
    }
    
    public void setPointsCost(Integer pointsCost) {
        this.pointsCost = pointsCost;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
