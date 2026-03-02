package com.sdkwork.app.model;

public class InvoiceDetailVO {
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
    private Double amountExcludingTax;
    private Double taxAmount;
    private Double totalAmount;
    private Double taxRate;
    private String currency;
    private String bankName;
    private String bankAccount;
    private String registerAddress;
    private String registerPhone;
    private String electronicUrl;
    private String invoiceTime;
    private List<InvoiceItemVO> items;

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

    public Double getAmountExcludingTax() {
        return this.amountExcludingTax;
    }
    
    public void setAmountExcludingTax(Double amountExcludingTax) {
        this.amountExcludingTax = amountExcludingTax;
    }

    public Double getTaxAmount() {
        return this.taxAmount;
    }
    
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTaxRate() {
        return this.taxRate;
    }
    
    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBankName() {
        return this.bankName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }
    
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getRegisterAddress() {
        return this.registerAddress;
    }
    
    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getRegisterPhone() {
        return this.registerPhone;
    }
    
    public void setRegisterPhone(String registerPhone) {
        this.registerPhone = registerPhone;
    }

    public String getElectronicUrl() {
        return this.electronicUrl;
    }
    
    public void setElectronicUrl(String electronicUrl) {
        this.electronicUrl = electronicUrl;
    }

    public String getInvoiceTime() {
        return this.invoiceTime;
    }
    
    public void setInvoiceTime(String invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public List<InvoiceItemVO> getItems() {
        return this.items;
    }
    
    public void setItems(List<InvoiceItemVO> items) {
        this.items = items;
    }
}
