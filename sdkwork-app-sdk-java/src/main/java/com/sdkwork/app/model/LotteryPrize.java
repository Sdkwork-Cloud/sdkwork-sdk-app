package com.sdkwork.app.model;

public class LotteryPrize {
    private String prizeId;
    private String name;
    private String image;
    private String probability;
    private Boolean isGrandPrize;
    private Integer remainingCount;

    public String getPrizeId() {
        return this.prizeId;
    }
    
    public void setPrizeId(String prizeId) {
        this.prizeId = prizeId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    public String getProbability() {
        return this.probability;
    }
    
    public void setProbability(String probability) {
        this.probability = probability;
    }

    public Boolean getIsGrandPrize() {
        return this.isGrandPrize;
    }
    
    public void setIsGrandPrize(Boolean isGrandPrize) {
        this.isGrandPrize = isGrandPrize;
    }

    public Integer getRemainingCount() {
        return this.remainingCount;
    }
    
    public void setRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }
}
