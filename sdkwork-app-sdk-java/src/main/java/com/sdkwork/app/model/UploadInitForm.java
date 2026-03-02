package com.sdkwork.app.model;

public class UploadInitForm {
    private String fileName;
    private Integer fileSize;
    private String fileMd5;
    private String fileType;
    private String uploadType;
    private Integer chunkSize;
    private Integer totalChunks;
    private String storagePath;
    private String businessType;
    private String businessId;

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

    public String getFileMd5() {
        return this.fileMd5;
    }
    
    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public String getFileType() {
        return this.fileType;
    }
    
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getUploadType() {
        return this.uploadType;
    }
    
    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
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

    public String getBusinessType() {
        return this.businessType;
    }
    
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessId() {
        return this.businessId;
    }
    
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}
