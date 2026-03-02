package com.sdkwork.app.model;

public class BrowseHistoryVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String type;
    private String targetId;
    private String targetName;
    private String targetDescription;
    private String targetIcon;
    private String browseTime;
    private Integer duration;
    private String source;

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

    public String getTargetId() {
        return this.targetId;
    }
    
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return this.targetName;
    }
    
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetDescription() {
        return this.targetDescription;
    }
    
    public void setTargetDescription(String targetDescription) {
        this.targetDescription = targetDescription;
    }

    public String getTargetIcon() {
        return this.targetIcon;
    }
    
    public void setTargetIcon(String targetIcon) {
        this.targetIcon = targetIcon;
    }

    public String getBrowseTime() {
        return this.browseTime;
    }
    
    public void setBrowseTime(String browseTime) {
        this.browseTime = browseTime;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }
}
