package com.sdkwork.app.model;

public class ChatExportForm {
    private String format;
    private String scope;
    private Integer count;
    private Boolean includeThinking;
    private Boolean includeSystemMessages;
    private Boolean includeAttachments;
    private String fileName;

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public String getScope() {
        return this.scope;
    }
    
    public void setScope(String scope) {
        this.scope = scope;
    }

    public Integer getCount() {
        return this.count;
    }
    
    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getIncludeThinking() {
        return this.includeThinking;
    }
    
    public void setIncludeThinking(Boolean includeThinking) {
        this.includeThinking = includeThinking;
    }

    public Boolean getIncludeSystemMessages() {
        return this.includeSystemMessages;
    }
    
    public void setIncludeSystemMessages(Boolean includeSystemMessages) {
        this.includeSystemMessages = includeSystemMessages;
    }

    public Boolean getIncludeAttachments() {
        return this.includeAttachments;
    }
    
    public void setIncludeAttachments(Boolean includeAttachments) {
        this.includeAttachments = includeAttachments;
    }

    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
