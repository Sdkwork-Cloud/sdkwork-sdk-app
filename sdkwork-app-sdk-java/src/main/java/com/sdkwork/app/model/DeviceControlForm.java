package com.sdkwork.app.model;

public class DeviceControlForm {
    private String action;
    private Map<String, Object> params;

    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }

    public Map<String, Object> getParams() {
        return this.params;
    }
    
    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
