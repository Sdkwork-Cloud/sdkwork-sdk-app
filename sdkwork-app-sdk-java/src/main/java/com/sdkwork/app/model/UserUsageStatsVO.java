package com.sdkwork.app.model;

public class UserUsageStatsVO {
    private String createdAt;
    private String updatedAt;
    private String statsId;
    private String userId;
    private Integer totalSessions;
    private Integer totalDuration;
    private Integer activeDays;
    private Integer lastActiveDays;
    private String deviceType;
    private String osType;
    private String firstSeen;
    private String lastSeen;
    private String userType;

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

    public String getStatsId() {
        return this.statsId;
    }
    
    public void setStatsId(String statsId) {
        this.statsId = statsId;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getTotalSessions() {
        return this.totalSessions;
    }
    
    public void setTotalSessions(Integer totalSessions) {
        this.totalSessions = totalSessions;
    }

    public Integer getTotalDuration() {
        return this.totalDuration;
    }
    
    public void setTotalDuration(Integer totalDuration) {
        this.totalDuration = totalDuration;
    }

    public Integer getActiveDays() {
        return this.activeDays;
    }
    
    public void setActiveDays(Integer activeDays) {
        this.activeDays = activeDays;
    }

    public Integer getLastActiveDays() {
        return this.lastActiveDays;
    }
    
    public void setLastActiveDays(Integer lastActiveDays) {
        this.lastActiveDays = lastActiveDays;
    }

    public String getDeviceType() {
        return this.deviceType;
    }
    
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getOsType() {
        return this.osType;
    }
    
    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getFirstSeen() {
        return this.firstSeen;
    }
    
    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    public String getLastSeen() {
        return this.lastSeen;
    }
    
    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getUserType() {
        return this.userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }
}
