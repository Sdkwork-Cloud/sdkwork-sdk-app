package com.sdkwork.app.model;

public class UploadChunkVO {
    private String createdAt;
    private String updatedAt;
    private String uploadId;
    private Integer chunkIndex;
    private Integer chunkSize;
    private String status;
    private Boolean success;
    private String errorMsg;
    private String chunkMd5;
    private Integer uploadedSize;
    private Integer remainingChunks;
    private Integer progress;

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

    public String getUploadId() {
        return this.uploadId;
    }
    
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public Integer getChunkIndex() {
        return this.chunkIndex;
    }
    
    public void setChunkIndex(Integer chunkIndex) {
        this.chunkIndex = chunkIndex;
    }

    public Integer getChunkSize() {
        return this.chunkSize;
    }
    
    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getSuccess() {
        return this.success;
    }
    
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }
    
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getChunkMd5() {
        return this.chunkMd5;
    }
    
    public void setChunkMd5(String chunkMd5) {
        this.chunkMd5 = chunkMd5;
    }

    public Integer getUploadedSize() {
        return this.uploadedSize;
    }
    
    public void setUploadedSize(Integer uploadedSize) {
        this.uploadedSize = uploadedSize;
    }

    public Integer getRemainingChunks() {
        return this.remainingChunks;
    }
    
    public void setRemainingChunks(Integer remainingChunks) {
        this.remainingChunks = remainingChunks;
    }

    public Integer getProgress() {
        return this.progress;
    }
    
    public void setProgress(Integer progress) {
        this.progress = progress;
    }
}
