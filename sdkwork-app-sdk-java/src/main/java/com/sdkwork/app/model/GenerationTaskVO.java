package com.sdkwork.app.model;

public class GenerationTaskVO {
    private String createdAt;
    private String updatedAt;
    private Integer taskId;
    private String requestId;
    private String type;
    private String model;
    private String channel;
    private String status;
    private Integer progress;
    private GenerationInput inputParams;
    private GenerationOutput outputResult;
    private Double cost;
    private String errorCode;
    private String errorMessage;
    private Integer retryCount;
    private Integer maxRetry;
    private String startedAt;
    private String completedAt;
    private Integer conversationId;
    private Integer messageId;
    private Integer parentId;
    private String batchId;
    private String bizScene;
    private Integer bizId;
    private Boolean done;

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

    public Integer getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getRequestId() {
        return this.requestId;
    }
    
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProgress() {
        return this.progress;
    }
    
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public GenerationInput getInputParams() {
        return this.inputParams;
    }
    
    public void setInputParams(GenerationInput inputParams) {
        this.inputParams = inputParams;
    }

    public GenerationOutput getOutputResult() {
        return this.outputResult;
    }
    
    public void setOutputResult(GenerationOutput outputResult) {
        this.outputResult = outputResult;
    }

    public Double getCost() {
        return this.cost;
    }
    
    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
    
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Integer getRetryCount() {
        return this.retryCount;
    }
    
    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public Integer getMaxRetry() {
        return this.maxRetry;
    }
    
    public void setMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry;
    }

    public String getStartedAt() {
        return this.startedAt;
    }
    
    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getCompletedAt() {
        return this.completedAt;
    }
    
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public Integer getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public Integer getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBizScene() {
        return this.bizScene;
    }
    
    public void setBizScene(String bizScene) {
        this.bizScene = bizScene;
    }

    public Integer getBizId() {
        return this.bizId;
    }
    
    public void setBizId(Integer bizId) {
        this.bizId = bizId;
    }

    public Boolean getDone() {
        return this.done;
    }
    
    public void setDone(Boolean done) {
        this.done = done;
    }
}
