package com.sdkwork.app.model;

public class FeedbackVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String type;
    private String content;
    private String status;
    private String submitTime;
    private String processTime;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubmitTime() {
        return this.submitTime;
    }
    
    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getProcessTime() {
        return this.processTime;
    }
    
    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }
}
