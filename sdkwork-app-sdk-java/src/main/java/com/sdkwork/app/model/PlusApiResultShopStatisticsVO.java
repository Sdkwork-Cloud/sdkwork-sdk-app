package com.sdkwork.app.model;

public class PlusApiResultShopStatisticsVO {
    private ShopStatisticsVO data;
    private String code;
    private String msg;
    private String requestId;
    private String ip;
    private String hostname;
    private String errorName;

    public ShopStatisticsVO getData() {
        return this.data;
    }
    
    public void setData(ShopStatisticsVO data) {
        this.data = data;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRequestId() {
        return this.requestId;
    }
    
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getIp() {
        return this.ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return this.hostname;
    }
    
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getErrorName() {
        return this.errorName;
    }
    
    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }
}
