package com.sdkwork.app.model;

public class AlgorithmConfigVO {
    private String createdAt;
    private String updatedAt;
    private String algorithmType;
    private Object algorithmParams;
    private String version;

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

    public String getAlgorithmType() {
        return this.algorithmType;
    }
    
    public void setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
    }

    public Object getAlgorithmParams() {
        return this.algorithmParams;
    }
    
    public void setAlgorithmParams(Object algorithmParams) {
        this.algorithmParams = algorithmParams;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
}
