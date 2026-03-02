package com.sdkwork.app.model;

public class TopicSubscribeForm {
    private String topic;
    private Boolean subscribe;
    private String deviceId;

    public String getTopic() {
        return this.topic;
    }
    
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Boolean getSubscribe() {
        return this.subscribe;
    }
    
    public void setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
    }

    public String getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
