package com.sdkwork.app.model;

public class ActivityDetailVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String title;
    private String description;
    private String type;
    private String coverImage;
    private List<String> bannerImages;
    private String rules;
    private String startTime;
    private String endTime;
    private Integer participantCount;
    private Boolean hasJoined;
    private Integer maxJoinCount;
    private Integer joinedCount;
    private Integer remainingCount;
    private List<ActivityReward> rewards;
    private Map<String, Object> extraConfig;

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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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

    public List<String> getBannerImages() {
        return this.bannerImages;
    }
    
    public void setBannerImages(List<String> bannerImages) {
        this.bannerImages = bannerImages;
    }

    public String getRules() {
        return this.rules;
    }
    
    public void setRules(String rules) {
        this.rules = rules;
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

    public Integer getParticipantCount() {
        return this.participantCount;
    }
    
    public void setParticipantCount(Integer participantCount) {
        this.participantCount = participantCount;
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

    public Integer getRemainingCount() {
        return this.remainingCount;
    }
    
    public void setRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }

    public List<ActivityReward> getRewards() {
        return this.rewards;
    }
    
    public void setRewards(List<ActivityReward> rewards) {
        this.rewards = rewards;
    }

    public Map<String, Object> getExtraConfig() {
        return this.extraConfig;
    }
    
    public void setExtraConfig(Map<String, Object> extraConfig) {
        this.extraConfig = extraConfig;
    }
}
