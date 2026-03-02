package com.sdkwork.app.model;

public class ConversationQueryForm {
    private Integer page;
    private Integer size;
    private String conversationType;
    private Boolean showUnread;
    private String keyword;

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

    public String getConversationType() {
        return this.conversationType;
    }
    
    public void setConversationType(String conversationType) {
        this.conversationType = conversationType;
    }

    public Boolean getShowUnread() {
        return this.showUnread;
    }
    
    public void setShowUnread(Boolean showUnread) {
        this.showUnread = showUnread;
    }

    public String getKeyword() {
        return this.keyword;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
