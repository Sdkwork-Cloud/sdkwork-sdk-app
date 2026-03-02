package com.sdkwork.app.model;

public class SkuDetailVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String productId;
    private String productName;
    private String skuCode;
    private String skuName;
    private Map<String, String> attributes;
    private Double price;
    private Double originalPrice;
    private Integer stock;
    private Integer warningStock;
    private Integer sales;
    private String mainImage;
    private List<String> images;
    private Double weight;
    private Double volume;
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

    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
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

    public Integer getWarningStock() {
        return this.warningStock;
    }
    
    public void setWarningStock(Integer warningStock) {
        this.warningStock = warningStock;
    }

    public Integer getSales() {
        return this.sales;
    }
    
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getMainImage() {
        return this.mainImage;
    }
    
    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public List<String> getImages() {
        return this.images;
    }
    
    public void setImages(List<String> images) {
        this.images = images;
    }

    public Double getWeight() {
        return this.weight;
    }
    
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getVolume() {
        return this.volume;
    }
    
    public void setVolume(Double volume) {
        this.volume = volume;
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
