package com.sdkwork.app.model;

public class UploadInitVO {
    private String createdAt;
    private String updatedAt;
    private String uploadId;
    private String fileName;
    private Integer fileSize;
    private Integer chunkSize;
    private Integer totalChunks;
    private String storagePath;
    private String uploadUrl;
    private Object uploadParams;
    private List<Integer> uploadedChunks;
    private Integer expireTime;
    private Boolean supportResume;
    private String uploadType;

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

    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getChunkSize() {
        return this.chunkSize;
    }
    
    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    public Integer getTotalChunks() {
        return this.totalChunks;
    }
    
    public void setTotalChunks(Integer totalChunks) {
        this.totalChunks = totalChunks;
    }

    public String getStoragePath() {
        return this.storagePath;
    }
    
    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public String getUploadUrl() {
        return this.uploadUrl;
    }
    
    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public Object getUploadParams() {
        return this.uploadParams;
    }
    
    public void setUploadParams(Object uploadParams) {
        this.uploadParams = uploadParams;
    }

    public List<Integer> getUploadedChunks() {
        return this.uploadedChunks;
    }
    
    public void setUploadedChunks(List<Integer> uploadedChunks) {
        this.uploadedChunks = uploadedChunks;
    }

    public Integer getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public Boolean getSupportResume() {
        return this.supportResume;
    }
    
    public void setSupportResume(Boolean supportResume) {
        this.supportResume = supportResume;
    }

    public String getUploadType() {
        return this.uploadType;
    }
    
    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }
}
