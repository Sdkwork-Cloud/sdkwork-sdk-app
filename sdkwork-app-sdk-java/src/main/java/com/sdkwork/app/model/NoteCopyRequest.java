package com.sdkwork.app.model;

public class NoteCopyRequest {
    private String folderId;
    private String title;

    public String getFolderId() {
        return this.folderId;
    }
    
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
}
