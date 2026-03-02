package com.sdkwork.app.model;

public class ShoppingCartVO {
    private String createdAt;
    private String updatedAt;
    private String cartId;
    private String uuid;
    private String name;
    private String description;
    private String owner;
    private Integer ownerId;
    private String status;
    private List<CartGroupVO> groups;
    private Integer totalQuantity;
    private Double totalPrice;
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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public List<CartGroupVO> getGroups() {
        return this.groups;
    }
    
    public void setGroups(List<CartGroupVO> groups) {
        this.groups = groups;
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
