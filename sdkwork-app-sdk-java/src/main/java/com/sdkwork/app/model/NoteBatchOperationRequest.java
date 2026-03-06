package com.sdkwork.app.model;

public class NoteBatchOperationRequest {
    private String type;
    private Integer index;
    private Integer startIndex;
    private Integer endIndex;
    private String text;
    private String searchText;
    private String replaceText;

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Integer getIndex() {
        return this.index;
    }
    
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getStartIndex() {
        return this.startIndex;
    }
    
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return this.endIndex;
    }
    
    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public String getSearchText() {
        return this.searchText;
    }
    
    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getReplaceText() {
        return this.replaceText;
    }
    
    public void setReplaceText(String replaceText) {
        this.replaceText = replaceText;
    }
}
