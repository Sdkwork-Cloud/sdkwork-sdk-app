package com.sdkwork.app.model;

public class VoiceSpeakerCreateForm {
    private String name;
    private String localName;
    private String code;
    private String faceImageUrl;
    private String channel;
    private String product;
    private String gender;
    private String ageType;
    private String type;
    private List<String> models;
    private String channelSpeakerId;
    private String version;
    private String description;
    private List<String> tags;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getLocalName() {
        return this.localName;
    }
    
    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getFaceImageUrl() {
        return this.faceImageUrl;
    }
    
    public void setFaceImageUrl(String faceImageUrl) {
        this.faceImageUrl = faceImageUrl;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeType() {
        return this.ageType;
    }
    
    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public List<String> getModels() {
        return this.models;
    }
    
    public void setModels(List<String> models) {
        this.models = models;
    }

    public String getChannelSpeakerId() {
        return this.channelSpeakerId;
    }
    
    public void setChannelSpeakerId(String channelSpeakerId) {
        this.channelSpeakerId = channelSpeakerId;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
