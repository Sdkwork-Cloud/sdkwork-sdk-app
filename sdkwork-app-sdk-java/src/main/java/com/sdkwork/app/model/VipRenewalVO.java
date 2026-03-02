package com.sdkwork.app.model;

public class VipRenewalVO {
    private String price;
    private String period;
    private String renewalUrl;
    private Boolean autoRenew;

    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }

    public String getPeriod() {
        return this.period;
    }
    
    public void setPeriod(String period) {
        this.period = period;
    }

    public String getRenewalUrl() {
        return this.renewalUrl;
    }
    
    public void setRenewalUrl(String renewalUrl) {
        this.renewalUrl = renewalUrl;
    }

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }
    
    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }
}
