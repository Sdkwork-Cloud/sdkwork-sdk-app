package com.sdkwork.app.model;

public class OrderVO {
    private String createdAt;
    private String updatedAt;
    private String orderId;
    private String orderSn;
    private String orderType;
    private String subject;
    private String productImage;
    private Integer quantity;
    private String totalAmount;
    private String paidAmount;
    private String paidPointsAmount;
    private String discountAmount;
    private String shippingAmount;
    private String status;
    private String statusName;
    private String refundStatus;
    private String paymentMethod;
    private String paymentProvider;
    private String payTime;
    private String expireTime;
    private String remark;

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

    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return this.orderSn;
    }
    
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getOrderType() {
        return this.orderType;
    }
    
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProductImage() {
        return this.productImage;
    }
    
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaidAmount() {
        return this.paidAmount;
    }
    
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getPaidPointsAmount() {
        return this.paidPointsAmount;
    }
    
    public void setPaidPointsAmount(String paidPointsAmount) {
        this.paidPointsAmount = paidPointsAmount;
    }

    public String getDiscountAmount() {
        return this.discountAmount;
    }
    
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getShippingAmount() {
        return this.shippingAmount;
    }
    
    public void setShippingAmount(String shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        return this.statusName;
    }
    
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getRefundStatus() {
        return this.refundStatus;
    }
    
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentProvider() {
        return this.paymentProvider;
    }
    
    public void setPaymentProvider(String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public String getPayTime() {
        return this.payTime;
    }
    
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
