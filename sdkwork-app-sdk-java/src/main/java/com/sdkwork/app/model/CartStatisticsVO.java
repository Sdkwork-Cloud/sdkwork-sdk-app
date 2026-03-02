package com.sdkwork.app.model;

public class CartStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private String cartId;
    private Integer itemCount;
    private Integer totalQuantity;
    private Double totalPrice;
    private Integer selectedItemCount;
    private Integer selectedQuantity;
    private Double selectedPrice;

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

    public String getCartId() {
        return this.cartId;
    }
    
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Integer getItemCount() {
        return this.itemCount;
    }
    
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public Integer getTotalQuantity() {
        return this.totalQuantity;
    }
    
    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getSelectedItemCount() {
        return this.selectedItemCount;
    }
    
    public void setSelectedItemCount(Integer selectedItemCount) {
        this.selectedItemCount = selectedItemCount;
    }

    public Integer getSelectedQuantity() {
        return this.selectedQuantity;
    }
    
    public void setSelectedQuantity(Integer selectedQuantity) {
        this.selectedQuantity = selectedQuantity;
    }

    public Double getSelectedPrice() {
        return this.selectedPrice;
    }
    
    public void setSelectedPrice(Double selectedPrice) {
        this.selectedPrice = selectedPrice;
    }
}
