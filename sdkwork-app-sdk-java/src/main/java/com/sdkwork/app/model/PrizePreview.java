package com.sdkwork.app.model;

public class PrizePreview {
    private String name;
    private String image;
    private Boolean isGrandPrize;

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

    public Boolean getIsGrandPrize() {
        return this.isGrandPrize;
    }
    
    public void setIsGrandPrize(Boolean isGrandPrize) {
        this.isGrandPrize = isGrandPrize;
    }
}
