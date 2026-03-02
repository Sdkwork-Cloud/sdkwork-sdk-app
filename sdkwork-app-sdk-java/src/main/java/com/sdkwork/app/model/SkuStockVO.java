package com.sdkwork.app.model;

public class SkuStockVO {
    private String createdAt;
    private String updatedAt;
    private String skuId;
    private String productId;
    private String skuCode;
    private String skuName;
    private Integer quantity;
    private Integer warningStock;
    private Integer lockedStock;
    private Integer availableStock;
    private String status;

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

    public String getSkuId() {
        return this.skuId;
    }
    
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSkuCode() {
        return this.skuCode;
    }
    
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuName() {
        return this.skuName;
    }
    
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getWarningStock() {
        return this.warningStock;
    }
    
    public void setWarningStock(Integer warningStock) {
        this.warningStock = warningStock;
    }

    public Integer getLockedStock() {
        return this.lockedStock;
    }
    
    public void setLockedStock(Integer lockedStock) {
        this.lockedStock = lockedStock;
    }

    public Integer getAvailableStock() {
        return this.availableStock;
    }
    
    public void setAvailableStock(Integer availableStock) {
        this.availableStock = availableStock;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
