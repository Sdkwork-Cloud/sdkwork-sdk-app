package com.sdkwork.app.model;

public class ChatSessionDetailVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private String description;
    private String type;
    private String status;
    private String userId;
    private String modelId;
    private String systemPrompt;
    private Double temperature;
    private Integer maxTokens;
    private Double topP;
    private Integer messageCount;
    private Integer unreadCount;
    private String lastMessageTime;
    private String lastMessageContent;
    private String resourceId;
    private String resourceType;
    private String createTime;
    private String updateTime;
    private Map<String, Object> extra;
    private SessionStatsVO stats;

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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getModelId() {
        return this.modelId;
    }
    
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getSystemPrompt() {
        return this.systemPrompt;
    }
    
    public void setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
    }

    public Double getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getMaxTokens() {
        return this.maxTokens;
    }
    
    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public Double getTopP() {
        return this.topP;
    }
    
    public void setTopP(Double topP) {
        this.topP = topP;
    }

    public Integer getMessageCount() {
        return this.messageCount;
    }
    
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    public Integer getUnreadCount() {
        return this.unreadCount;
    }
    
    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    public String getLastMessageTime() {
        return this.lastMessageTime;
    }
    
    public void setLastMessageTime(String lastMessageTime) {
        this.lastMessageTime = lastMessageTime;
    }

    public String getLastMessageContent() {
        return this.lastMessageContent;
    }
    
    public void setLastMessageContent(String lastMessageContent) {
        this.lastMessageContent = lastMessageContent;
    }

    public String getResourceId() {
        return this.resourceId;
    }
    
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return this.resourceType;
    }
    
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Map<String, Object> getExtra() {
        return this.extra;
    }
    
    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }

    public SessionStatsVO getStats() {
        return this.stats;
    }
    
    public void setStats(SessionStatsVO stats) {
        this.stats = stats;
    }
}
