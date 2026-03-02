package com.sdkwork.app.model;

public class CharacterDetailVO {
    private String createdAt;
    private String updatedAt;
    private String characterId;
    private String name;
    private String type;
    private String description;
    private ImageMediaResource avatar;
    private ImageMediaResource threeViewImage;
    private ImageMediaResource gridShotsImage;
    private VideoMediaResource avatarVideo;
    private String status;
    private Integer agentId;
    private String personality;
    private String background;
    private String interactionSettings;
    private String version;
    private Boolean isPublic;
    private Integer usageCount;
    private Integer likeCount;
    private String lastUsedAt;

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

    public String getCharacterId() {
        return this.characterId;
    }
    
    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public ImageMediaResource getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(ImageMediaResource avatar) {
        this.avatar = avatar;
    }

    public ImageMediaResource getThreeViewImage() {
        return this.threeViewImage;
    }
    
    public void setThreeViewImage(ImageMediaResource threeViewImage) {
        this.threeViewImage = threeViewImage;
    }

    public ImageMediaResource getGridShotsImage() {
        return this.gridShotsImage;
    }
    
    public void setGridShotsImage(ImageMediaResource gridShotsImage) {
        this.gridShotsImage = gridShotsImage;
    }

    public VideoMediaResource getAvatarVideo() {
        return this.avatarVideo;
    }
    
    public void setAvatarVideo(VideoMediaResource avatarVideo) {
        this.avatarVideo = avatarVideo;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAgentId() {
        return this.agentId;
    }
    
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getPersonality() {
        return this.personality;
    }
    
    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getBackground() {
        return this.background;
    }
    
    public void setBackground(String background) {
        this.background = background;
    }

    public String getInteractionSettings() {
        return this.interactionSettings;
    }
    
    public void setInteractionSettings(String interactionSettings) {
        this.interactionSettings = interactionSettings;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Integer getUsageCount() {
        return this.usageCount;
    }
    
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }
    
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getLastUsedAt() {
        return this.lastUsedAt;
    }
    
    public void setLastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }
}
