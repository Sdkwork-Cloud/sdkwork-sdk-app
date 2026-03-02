package com.sdkwork.app.model;

public class FileSystemDiskVO {
    private String createdAt;
    private String updatedAt;
    private String diskId;
    private String diskUuid;
    private String name;
    private String type;
    private String owner;
    private String ownerId;
    private Integer totalSize;
    private Integer usedSize;
    private Integer remainingSize;
    private Double usageRate;
    private Integer fileCount;
    private String description;

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

    public String getDiskId() {
        return this.diskId;
    }
    
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getDiskUuid() {
        return this.diskUuid;
    }
    
    public void setDiskUuid(String diskUuid) {
        this.diskUuid = diskUuid;
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

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getTotalSize() {
        return this.totalSize;
    }
    
    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public Integer getUsedSize() {
        return this.usedSize;
    }
    
    public void setUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
    }

    public Integer getRemainingSize() {
        return this.remainingSize;
    }
    
    public void setRemainingSize(Integer remainingSize) {
        this.remainingSize = remainingSize;
    }

    public Double getUsageRate() {
        return this.usageRate;
    }
    
    public void setUsageRate(Double usageRate) {
        this.usageRate = usageRate;
    }

    public Integer getFileCount() {
        return this.fileCount;
    }
    
    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
