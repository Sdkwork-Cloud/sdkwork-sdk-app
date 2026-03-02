package com.sdkwork.app.model;

public class PaymentCreateForm {
    private String orderId;
    private String businessType;
    private String businessOrderId;
    private String amount;
    private String paymentMethod;
    private String paymentScene;
    private String clientIp;
    private String paymentProvider;
    private String productType;

    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBusinessType() {
        return this.businessType;
    }
    
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessOrderId() {
        return this.businessOrderId;
    }
    
    public void setBusinessOrderId(String businessOrderId) {
        this.businessOrderId = businessOrderId;
    }

    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentScene() {
        return this.paymentScene;
    }
    
    public void setPaymentScene(String paymentScene) {
        this.paymentScene = paymentScene;
    }

    public String getClientIp() {
        return this.clientIp;
    }
    
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getPaymentProvider() {
        return this.paymentProvider;
    }
    
    public void setPaymentProvider(String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public String getProductType() {
        return this.productType;
    }
    
    public void setProductType(String productType) {
        this.productType = productType;
    }
}
