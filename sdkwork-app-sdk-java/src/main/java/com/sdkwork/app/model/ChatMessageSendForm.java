package com.sdkwork.app.model;

public class ChatMessageSendForm {
    private Integer sessionId;
    private String content;
    private String type;
    private String format;
    private Integer quoteMessageId;
    private Boolean needThinking;
    private Boolean streaming;
    private String modelId;
    private String systemPrompt;
    private Double temperature;
    private Integer maxTokens;
    private Double topP;

    public Integer getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getQuoteMessageId() {
        return this.quoteMessageId;
    }
    
    public void setQuoteMessageId(Integer quoteMessageId) {
        this.quoteMessageId = quoteMessageId;
    }

    public Boolean getNeedThinking() {
        return this.needThinking;
    }
    
    public void setNeedThinking(Boolean needThinking) {
        this.needThinking = needThinking;
    }

    public Boolean getStreaming() {
        return this.streaming;
    }
    
    public void setStreaming(Boolean streaming) {
        this.streaming = streaming;
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
}
