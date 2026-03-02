package com.sdkwork.app.model;

public class InvoiceUpdateForm {
    private String title;
    private String taxNo;
    private String bankName;
    private String bankAccount;
    private String registerAddress;
    private String registerPhone;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaxNo() {
        return this.taxNo;
    }
    
    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
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
}
