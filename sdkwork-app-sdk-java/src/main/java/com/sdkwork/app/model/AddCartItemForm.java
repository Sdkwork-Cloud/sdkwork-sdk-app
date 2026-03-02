package com.sdkwork.app.model;

public class AddCartItemForm {
    private Integer skuId;
    private Integer productId;
    private Integer quantity;
    private String cartGroupUuid;

    public Integer getSkuId() {
        return this.skuId;
    }
    
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCartGroupUuid() {
        return this.cartGroupUuid;
    }
    
    public void setCartGroupUuid(String cartGroupUuid) {
        this.cartGroupUuid = cartGroupUuid;
    }
}
