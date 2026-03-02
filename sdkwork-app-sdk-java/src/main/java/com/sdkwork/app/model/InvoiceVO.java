package com.sdkwork.app.model;

public class InvoiceVO {
    private String createdAt;
    private String updatedAt;
    private String invoiceId;
    private String title;
    private String titleType;
    private String taxNo;
    private String type;
    private String status;
    private String invoiceCode;
    private String invoiceNo;
    private Double totalAmount;
    private String currency;

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

    public String getInvoiceId() {
        return this.invoiceId;
    }
    
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleType() {
        return this.titleType;
    }
    
    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public String getTaxNo() {
        return this.taxNo;
    }
    
    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getInvoiceCode() {
        return this.invoiceCode;
    }
    
    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceNo() {
        return this.invoiceNo;
    }
    
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Double getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
