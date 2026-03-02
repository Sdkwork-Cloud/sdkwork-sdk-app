package com.sdkwork.app.model;

public class OrderDetailVO {
    private String createdAt;
    private String updatedAt;
    private String orderId;
    private String orderSn;
    private String orderType;
    private String orderTypeName;
    private String subject;
    private String productId;
    private String productImage;
    private Integer quantity;
    private String productAmount;
    private String shippingAmount;
    private String discountAmount;
    private String taxAmount;
    private String totalAmount;
    private String paidAmount;
    private String paidPointsAmount;
    private String refundedAmount;
    private String status;
    private String statusName;
    private String refundStatus;
    private String refundStatusName;
    private String paymentMethod;
    private String paymentProvider;
    private String transactionId;
    private String outTradeNo;
    private String currency;
    private String payTime;
    private String expireTime;
    private String completeTime;
    private String cancelTime;
    private String remark;
    private String merchantRemark;
    private String sourceChannel;
    private Integer userId;
    private String username;
    private String email;
    private String receiverName;
    private String receiverPhone;
    private String receiverAddress;
    private String logisticsCompany;
    private String logisticsNo;
    private String deliverTime;
    private CouponInfoVO couponInfo;
    private List<OrderItemVO> items;
    private OrderAddressVO address;

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

    public String getOrderTypeName() {
        return this.orderTypeName;
    }
    
    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }

    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
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

    public String getProductAmount() {
        return this.productAmount;
    }
    
    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount;
    }

    public String getShippingAmount() {
        return this.shippingAmount;
    }
    
    public void setShippingAmount(String shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public String getDiscountAmount() {
        return this.discountAmount;
    }
    
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getTaxAmount() {
        return this.taxAmount;
    }
    
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
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

    public String getRefundedAmount() {
        return this.refundedAmount;
    }
    
    public void setRefundedAmount(String refundedAmount) {
        this.refundedAmount = refundedAmount;
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

    public String getRefundStatusName() {
        return this.refundStatusName;
    }
    
    public void setRefundStatusName(String refundStatusName) {
        this.refundStatusName = refundStatusName;
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

    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }
    
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
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

    public String getCompleteTime() {
        return this.completeTime;
    }
    
    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getCancelTime() {
        return this.cancelTime;
    }
    
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMerchantRemark() {
        return this.merchantRemark;
    }
    
    public void setMerchantRemark(String merchantRemark) {
        this.merchantRemark = merchantRemark;
    }

    public String getSourceChannel() {
        return this.sourceChannel;
    }
    
    public void setSourceChannel(String sourceChannel) {
        this.sourceChannel = sourceChannel;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getReceiverName() {
        return this.receiverName;
    }
    
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return this.receiverPhone;
    }
    
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverAddress() {
        return this.receiverAddress;
    }
    
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getLogisticsCompany() {
        return this.logisticsCompany;
    }
    
    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsNo() {
        return this.logisticsNo;
    }
    
    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public String getDeliverTime() {
        return this.deliverTime;
    }
    
    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
    }

    public CouponInfoVO getCouponInfo() {
        return this.couponInfo;
    }
    
    public void setCouponInfo(CouponInfoVO couponInfo) {
        this.couponInfo = couponInfo;
    }

    public List<OrderItemVO> getItems() {
        return this.items;
    }
    
    public void setItems(List<OrderItemVO> items) {
        this.items = items;
    }

    public OrderAddressVO getAddress() {
        return this.address;
    }
    
    public void setAddress(OrderAddressVO address) {
        this.address = address;
    }
}
