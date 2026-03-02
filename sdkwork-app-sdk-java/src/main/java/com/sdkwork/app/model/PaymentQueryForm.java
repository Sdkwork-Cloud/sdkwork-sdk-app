package com.sdkwork.app.model;

public class PaymentQueryForm {
    private String paymentOrderId;
    private String merchantOrderId;
    private String queryType;
    private String status;
    private Integer page;
    private Integer size;

    public String getPaymentOrderId() {
        return this.paymentOrderId;
    }
    
    public void setPaymentOrderId(String paymentOrderId) {
        this.paymentOrderId = paymentOrderId;
    }

    public String getMerchantOrderId() {
        return this.merchantOrderId;
    }
    
    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
    }

    public String getQueryType() {
        return this.queryType;
    }
    
    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPage() {
        return this.page;
    }
    
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }
}
