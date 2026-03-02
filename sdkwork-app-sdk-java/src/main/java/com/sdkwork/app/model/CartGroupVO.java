package com.sdkwork.app.model;

public class CartGroupVO {
    private String createdAt;
    private String updatedAt;
    private String uuid;
    private String name;
    private List<CartItemVO> items;
    private Integer totalQuantity;
    private Double totalPrice;

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

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public List<CartItemVO> getItems() {
        return this.items;
    }
    
    public void setItems(List<CartItemVO> items) {
        this.items = items;
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
}
