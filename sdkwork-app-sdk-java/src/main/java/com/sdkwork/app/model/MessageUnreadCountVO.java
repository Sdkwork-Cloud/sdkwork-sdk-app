package com.sdkwork.app.model;

public class MessageUnreadCountVO {
    private String createdAt;
    private String updatedAt;
    private Integer totalUnread;
    private Integer privateUnread;
    private Integer systemUnread;

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

    public Integer getTotalUnread() {
        return this.totalUnread;
    }
    
    public void setTotalUnread(Integer totalUnread) {
        this.totalUnread = totalUnread;
    }

    public Integer getPrivateUnread() {
        return this.privateUnread;
    }
    
    public void setPrivateUnread(Integer privateUnread) {
        this.privateUnread = privateUnread;
    }

    public Integer getSystemUnread() {
        return this.systemUnread;
    }
    
    public void setSystemUnread(Integer systemUnread) {
        this.systemUnread = systemUnread;
    }
}
