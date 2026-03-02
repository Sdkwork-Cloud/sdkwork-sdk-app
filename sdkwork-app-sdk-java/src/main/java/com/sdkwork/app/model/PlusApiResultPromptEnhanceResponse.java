package com.sdkwork.app.model;

public class PlusApiResultPromptEnhanceResponse {
    private Integer code;
    private String msg;
    private PromptEnhanceResponse data;
    private String timestamp;
    private String traceId;

    public Integer getCode() {
        return this.code;
    }
    
    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PromptEnhanceResponse getData() {
        return this.data;
    }
    
    public void setData(PromptEnhanceResponse data) {
        this.data = data;
    }

    public String getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTraceId() {
        return this.traceId;
    }
    
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
}
