package com.sdkwork.app.model;

public class OrderAddressVO {
    private String recipient;
    private String phone;
    private String address;

    public String getRecipient() {
        return this.recipient;
    }
    
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}
