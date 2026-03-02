package com.sdkwork.app.model;

public class SystemStatusVO {
    private String createdAt;
    private String updatedAt;
    private String status;
    private String message;
    private String timestamp;
    private String version;
    private ServiceStatus services;

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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public ServiceStatus getServices() {
        return this.services;
    }
    
    public void setServices(ServiceStatus services) {
        this.services = services;
    }
}
