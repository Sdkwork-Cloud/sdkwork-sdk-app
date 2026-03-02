package com.sdkwork.app.model;

public class ChatMessageQueryForm {
    private Integer sessionId;
    private Integer messageId;
    private Integer page;
    private Integer size;
    private String sort;

    public Integer getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getPage() {
        return this.page;
    }
    
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }

    public String getSort() {
        return this.sort;
    }
    
    public void setSort(String sort) {
        this.sort = sort;
    }
}
