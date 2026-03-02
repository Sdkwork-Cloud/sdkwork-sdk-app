package com.sdkwork.app.model;

public class SkuVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String productId;
    private String skuCode;
    private String skuName;
    private Map<String, String> attributes;
    private Double price;
    private Double originalPrice;
    private Integer stock;
    private Integer sales;
    private String image;
    private String status;
    private Integer sort;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
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

    public Map<String, String> getAttributes() {
        return this.attributes;
    }
    
    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getOriginalPrice() {
        return this.originalPrice;
    }
    
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSales() {
        return this.sales;
    }
    
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
