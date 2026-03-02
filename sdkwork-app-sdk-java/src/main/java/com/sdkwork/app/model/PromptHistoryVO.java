package com.sdkwork.app.model;

public class PromptHistoryVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private Integer promptId;
    private String promptTitle;
    private String promptContent;
    private String usedContent;
    private String responseContent;
    private String model;
    private Integer duration;
    private Integer inputTokens;
    private Integer outputTokens;
    private Boolean success;
    private String errorMessage;

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

    public Integer getPromptId() {
        return this.promptId;
    }
    
    public void setPromptId(Integer promptId) {
        this.promptId = promptId;
    }

    public String getPromptTitle() {
        return this.promptTitle;
    }
    
    public void setPromptTitle(String promptTitle) {
        this.promptTitle = promptTitle;
    }

    public String getPromptContent() {
        return this.promptContent;
    }
    
    public void setPromptContent(String promptContent) {
        this.promptContent = promptContent;
    }

    public String getUsedContent() {
        return this.usedContent;
    }
    
    public void setUsedContent(String usedContent) {
        this.usedContent = usedContent;
    }

    public String getResponseContent() {
        return this.responseContent;
    }
    
    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getInputTokens() {
        return this.inputTokens;
    }
    
    public void setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
    }

    public Integer getOutputTokens() {
        return this.outputTokens;
    }
    
    public void setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
    }

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
