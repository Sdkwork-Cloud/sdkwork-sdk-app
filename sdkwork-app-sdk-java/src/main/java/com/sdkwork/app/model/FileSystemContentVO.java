package com.sdkwork.app.model;

public class FileSystemContentVO {
    private String createdAt;
    private String updatedAt;
    private String nodeId;
    private String nodeUuid;
    private String contentId;
    private String fileVersion;
    private String encoding;
    private String prompt;
    private String thinkingContent;
    private String text;
    private Map<String, String> contents;
    private Integer charCount;
    private Integer wordCount;

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

    public String getNodeId() {
        return this.nodeId;
    }
    
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeUuid() {
        return this.nodeUuid;
    }
    
    public void setNodeUuid(String nodeUuid) {
        this.nodeUuid = nodeUuid;
    }

    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getFileVersion() {
        return this.fileVersion;
    }
    
    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
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

    public Integer getCharCount() {
        return this.charCount;
    }
    
    public void setCharCount(Integer charCount) {
        this.charCount = charCount;
    }

    public Integer getWordCount() {
        return this.wordCount;
    }
    
    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }
}
