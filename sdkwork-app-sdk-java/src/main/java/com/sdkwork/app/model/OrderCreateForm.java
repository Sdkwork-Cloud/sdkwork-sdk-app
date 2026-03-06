package com.sdkwork.app.model;

public class OrderCreateForm {
    private String orderType;
    private String productId;
    private Integer quantity;
    private List<OrderItemForm> items;
    private String addressId;
    private String paymentMethod;
    private String couponId;
    private String remark;
    private String sourceChannel;
    private Integer rechargePoints;
    private Boolean orderPayloadValid;

    public String getOrderType() {
        return this.orderType;
    }
    
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<OrderItemForm> getItems() {
        return this.items;
    }
    
    public void setItems(List<OrderItemForm> items) {
        this.items = items;
    }

    public String getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCouponId() {
        return this.couponId;
    }
    
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSourceChannel() {
        return this.sourceChannel;
    }
    
    public void setSourceChannel(String sourceChannel) {
        this.sourceChannel = sourceChannel;
    }

    public Integer getRechargePoints() {
        return this.rechargePoints;
    }
    
    public void setRechargePoints(Integer rechargePoints) {
        this.rechargePoints = rechargePoints;
    }

    public Boolean getOrderPayloadValid() {
        return this.orderPayloadValid;
    }
    
    public void setOrderPayloadValid(Boolean orderPayloadValid) {
        this.orderPayloadValid = orderPayloadValid;
    }
}
