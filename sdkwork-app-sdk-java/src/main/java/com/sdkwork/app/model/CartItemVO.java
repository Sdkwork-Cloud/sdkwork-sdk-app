package com.sdkwork.app.model;

public class CartItemVO {
    private String createdAt;
    private String updatedAt;
    private String itemId;
    private String uuid;
    private String cartId;
    private String cartGroupUuid;
    private String productId;
    private String skuId;
    private String skuName;
    private String skuCode;
    private String skuImage;
    private Double skuPrice;
    private Integer quantity;
    private Double price;
    private Double totalPrice;
    private Boolean selected;

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

    public String getItemId() {
        return this.itemId;
    }
    
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCartId() {
        return this.cartId;
    }
    
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getCartGroupUuid() {
        return this.cartGroupUuid;
    }
    
    public void setCartGroupUuid(String cartGroupUuid) {
        this.cartGroupUuid = cartGroupUuid;
    }

    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSkuId() {
        return this.skuId;
    }
    
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return this.skuName;
    }
    
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuCode() {
        return this.skuCode;
    }
    
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuImage() {
        return this.skuImage;
    }
    
    public void setSkuImage(String skuImage) {
        this.skuImage = skuImage;
    }

    public Double getSkuPrice() {
        return this.skuPrice;
    }
    
    public void setSkuPrice(Double skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getSelected() {
        return this.selected;
    }
    
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
