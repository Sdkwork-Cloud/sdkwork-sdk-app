package com.sdkwork.app.model;

public class DeviceMessageVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String messageId;
    private String deviceId;
    private String type;
    private String direction;
    private Map<String, Object> payload;
    private String topic;
    private Boolean processed;
    private String error;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getDirection() {
        return this.direction;
    }
    
    public void setDirection(String direction) {
        this.direction = direction;
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

    public Boolean getProcessed() {
        return this.processed;
    }
    
    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }

    public String getError() {
        return this.error;
    }
    
    public void setError(String error) {
        this.error = error;
    }
}
