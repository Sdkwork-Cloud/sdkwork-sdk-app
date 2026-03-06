package com.sdkwork.app.model;

public class DeviceMessageSendForm {
    private String type;
    private Map<String, Object> payload;
    private String topic;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getPayload() {
        return this.payload;
    }
    
    public void setPayload(Map<String, Object> payload) {
        this.payload = payload;
    }

    public String getTopic() {
        return this.topic;
    }
    
    public void setTopic(String topic) {
        this.topic = topic;
    }
}
