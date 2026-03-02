package com.sdkwork.app.model;

public class CustomerServiceInfo {
    private String serviceId;
    private String serviceName;
    private String servicePhone;
    private String serviceWechat;
    private Boolean online;

    public String getServiceId() {
        return this.serviceId;
    }
    
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return this.serviceName;
    }
    
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServicePhone() {
        return this.servicePhone;
    }
    
    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public String getServiceWechat() {
        return this.serviceWechat;
    }
    
    public void setServiceWechat(String serviceWechat) {
        this.serviceWechat = serviceWechat;
    }

    public Boolean getOnline() {
        return this.online;
    }
    
    public void setOnline(Boolean online) {
        this.online = online;
    }
}
