package com.sdkwork.app.model;

public class DownloadSettings {
    private String downloadPath;
    private Boolean wifiOnly;
    private Boolean autoDownload;
    private Integer maxConcurrent;

    public String getDownloadPath() {
        return this.downloadPath;
    }
    
    public void setDownloadPath(String downloadPath) {
        this.downloadPath = downloadPath;
    }

    public Boolean getWifiOnly() {
        return this.wifiOnly;
    }
    
    public void setWifiOnly(Boolean wifiOnly) {
        this.wifiOnly = wifiOnly;
    }

    public Boolean getAutoDownload() {
        return this.autoDownload;
    }
    
    public void setAutoDownload(Boolean autoDownload) {
        this.autoDownload = autoDownload;
    }

    public Integer getMaxConcurrent() {
        return this.maxConcurrent;
    }
    
    public void setMaxConcurrent(Integer maxConcurrent) {
        this.maxConcurrent = maxConcurrent;
    }
}
