package com.sdkwork.app.model;

public class ModelPriceVO {
    private String createdAt;
    private String updatedAt;
    private String model;
    private String unit;
    private String currency;
    private Double price;
    private Double inputPrice;
    private Double outputPrice;
    private Double batchInputPrice;
    private Double batchOutputPrice;
    private Double cachedInputPrice;
    private Double batchCachedInputPrice;

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

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getInputPrice() {
        return this.inputPrice;
    }
    
    public void setInputPrice(Double inputPrice) {
        this.inputPrice = inputPrice;
    }

    public Double getOutputPrice() {
        return this.outputPrice;
    }
    
    public void setOutputPrice(Double outputPrice) {
        this.outputPrice = outputPrice;
    }

    public Double getBatchInputPrice() {
        return this.batchInputPrice;
    }
    
    public void setBatchInputPrice(Double batchInputPrice) {
        this.batchInputPrice = batchInputPrice;
    }

    public Double getBatchOutputPrice() {
        return this.batchOutputPrice;
    }
    
    public void setBatchOutputPrice(Double batchOutputPrice) {
        this.batchOutputPrice = batchOutputPrice;
    }

    public Double getCachedInputPrice() {
        return this.cachedInputPrice;
    }
    
    public void setCachedInputPrice(Double cachedInputPrice) {
        this.cachedInputPrice = cachedInputPrice;
    }

    public Double getBatchCachedInputPrice() {
        return this.batchCachedInputPrice;
    }
    
    public void setBatchCachedInputPrice(Double batchCachedInputPrice) {
        this.batchCachedInputPrice = batchCachedInputPrice;
    }
}
