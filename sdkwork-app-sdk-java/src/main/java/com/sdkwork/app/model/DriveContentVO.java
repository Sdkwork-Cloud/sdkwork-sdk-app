package com.sdkwork.app.model;

public class DriveContentVO {
    private String createdAt;
    private String updatedAt;
    private String fileId;
    private String fileUuid;
    private String fileVersion;
    private String contentId;
    private String encoding;
    private String prompt;
    private String thinkingContent;
    private String text;
    private Map<String, String> contents;

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

    public String getFileId() {
        return this.fileId;
    }
    
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileUuid() {
        return this.fileUuid;
    }
    
    public void setFileUuid(String fileUuid) {
        this.fileUuid = fileUuid;
    }

    public String getFileVersion() {
        return this.fileVersion;
    }
    
    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getEncoding() {
        return this.encoding;
    }
    
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getThinkingContent() {
        return this.thinkingContent;
    }
    
    public void setThinkingContent(String thinkingContent) {
        this.thinkingContent = thinkingContent;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public Map<String, String> getContents() {
        return this.contents;
    }
    
    public void setContents(Map<String, String> contents) {
        this.contents = contents;
    }
}
