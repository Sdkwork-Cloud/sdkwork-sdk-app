package com.sdkwork.app.model;

public class DocumentContentVO {
    private String createdAt;
    private String updatedAt;
    private String documentId;
    private String documentUuid;
    private String contentId;
    private String versionId;
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

    public String getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentUuid() {
        return this.documentUuid;
    }
    
    public void setDocumentUuid(String documentUuid) {
        this.documentUuid = documentUuid;
    }

    public String getContentId() {
        return this.contentId;
    }
    
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getVersionId() {
        return this.versionId;
    }
    
    public void setVersionId(String versionId) {
        this.versionId = versionId;
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
