package com.sdkwork.app.model;

public class DocumentContentUpdateRequest {
    private String text;
    private Map<String, String> contents;
    private String prompt;
    private String thinkingContent;
    private String encoding;

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

    public String getEncoding() {
        return this.encoding;
    }
    
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}
