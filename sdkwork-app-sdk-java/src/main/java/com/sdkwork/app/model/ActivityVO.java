package com.sdkwork.app.model;

public class ActivityVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String title;
    private String subtitle;
    private String type;
    private String coverImage;
    private String status;
    private String startTime;
    private String endTime;
    private Boolean hasJoined;
    private Integer maxJoinCount;
    private Integer joinedCount;
    private List<String> tags;

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

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }
    
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
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

    public Boolean getHasJoined() {
        return this.hasJoined;
    }
    
    public void setHasJoined(Boolean hasJoined) {
        this.hasJoined = hasJoined;
    }

    public Integer getMaxJoinCount() {
        return this.maxJoinCount;
    }
    
    public void setMaxJoinCount(Integer maxJoinCount) {
        this.maxJoinCount = maxJoinCount;
    }

    public Integer getJoinedCount() {
        return this.joinedCount;
    }
    
    public void setJoinedCount(Integer joinedCount) {
        this.joinedCount = joinedCount;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
