package com.sdkwork.app.model;

public class NotificationVO {
    private String createdAt;
    private String updatedAt;
    private String notificationId;
    private String title;
    private String content;
    private String type;
    private String status;
    private String source;
    private String link;
    private Boolean isRead;
    private String readAt;

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

    public String getNotificationId() {
        return this.notificationId;
    }
    
    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }

    public String getLink() {
        return this.link;
    }
    
    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getIsRead() {
        return this.isRead;
    }
    
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public String getReadAt() {
        return this.readAt;
    }
    
    public void setReadAt(String readAt) {
        this.readAt = readAt;
    }
}
