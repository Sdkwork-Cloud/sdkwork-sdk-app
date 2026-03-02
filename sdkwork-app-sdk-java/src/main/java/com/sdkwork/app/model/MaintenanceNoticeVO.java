package com.sdkwork.app.model;

public class MaintenanceNoticeVO {
    private String createdAt;
    private String updatedAt;
    private String noticeId;
    private String title;
    private String content;
    private String startTime;
    private String endTime;
    private String status;
    private String maintenanceType;
    private String affectedServices;
    private String contactInfo;
    private Boolean isEmergency;

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

    public String getNoticeId() {
        return this.noticeId;
    }
    
    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
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

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getMaintenanceType() {
        return this.maintenanceType;
    }
    
    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public String getAffectedServices() {
        return this.affectedServices;
    }
    
    public void setAffectedServices(String affectedServices) {
        this.affectedServices = affectedServices;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }
    
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Boolean getIsEmergency() {
        return this.isEmergency;
    }
    
    public void setIsEmergency(Boolean isEmergency) {
        this.isEmergency = isEmergency;
    }
}
