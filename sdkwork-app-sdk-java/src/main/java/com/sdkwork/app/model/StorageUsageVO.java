package com.sdkwork.app.model;

public class StorageUsageVO {
    private Integer totalSize;
    private Integer usedSize;
    private Integer remainingSize;
    private Integer fileCount;

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

    public Integer getFileCount() {
        return this.fileCount;
    }
    
    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
    }
}
