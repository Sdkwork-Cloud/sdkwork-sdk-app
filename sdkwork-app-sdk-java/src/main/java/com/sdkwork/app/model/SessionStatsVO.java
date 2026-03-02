package com.sdkwork.app.model;

public class SessionStatsVO {
    private Integer totalMessages;
    private Integer userMessages;
    private Integer aiMessages;
    private Integer totalTokens;
    private Integer avgResponseTime;
    private Integer totalDuration;

    public Integer getTotalMessages() {
        return this.totalMessages;
    }
    
    public void setTotalMessages(Integer totalMessages) {
        this.totalMessages = totalMessages;
    }

    public Integer getUserMessages() {
        return this.userMessages;
    }
    
    public void setUserMessages(Integer userMessages) {
        this.userMessages = userMessages;
    }

    public Integer getAiMessages() {
        return this.aiMessages;
    }
    
    public void setAiMessages(Integer aiMessages) {
        this.aiMessages = aiMessages;
    }

    public Integer getTotalTokens() {
        return this.totalTokens;
    }
    
    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    public Integer getAvgResponseTime() {
        return this.avgResponseTime;
    }
    
    public void setAvgResponseTime(Integer avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
    }

    public Integer getTotalDuration() {
        return this.totalDuration;
    }
    
    public void setTotalDuration(Integer totalDuration) {
        this.totalDuration = totalDuration;
    }
}
