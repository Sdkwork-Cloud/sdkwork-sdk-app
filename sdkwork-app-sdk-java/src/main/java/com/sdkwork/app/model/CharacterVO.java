package com.sdkwork.app.model;

public class CharacterVO {
    private String createdAt;
    private String updatedAt;
    private String characterId;
    private String name;
    private String type;
    private String description;
    private ImageMediaResource avatar;
    private String status;
    private Integer agentId;
    private Boolean isPublic;
    private Integer usageCount;
    private Integer likeCount;

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
}
