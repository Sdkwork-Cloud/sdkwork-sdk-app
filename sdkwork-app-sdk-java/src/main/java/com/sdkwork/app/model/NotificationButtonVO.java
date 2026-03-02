package com.sdkwork.app.model;

public class NotificationButtonVO {
    private String text;
    private String type;
    private String url;
    private String action;
    private Boolean closeOnClick;

    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }

    public Boolean getCloseOnClick() {
        return this.closeOnClick;
    }
    
    public void setCloseOnClick(Boolean closeOnClick) {
        this.closeOnClick = closeOnClick;
    }
}
