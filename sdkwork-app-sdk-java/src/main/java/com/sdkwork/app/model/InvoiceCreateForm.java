package com.sdkwork.app.model;

public class InvoiceCreateForm {
    private String title;
    private String titleType;
    private String taxNo;
    private String type;
    private Double totalAmount;

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

    public Double getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
