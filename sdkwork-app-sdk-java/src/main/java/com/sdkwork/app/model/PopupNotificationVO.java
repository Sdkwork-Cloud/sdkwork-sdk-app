package com.sdkwork.app.model;

public class PopupNotificationVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String title;
    private String content;
    private String type;
    private String icon;
    private String image;
    private String url;
    private List<NotificationButtonVO> buttons;
    private Boolean needConfirm;
    private Boolean closable;
    private Integer duration;
    private Integer priority;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public List<NotificationButtonVO> getButtons() {
        return this.buttons;
    }
    
    public void setButtons(List<NotificationButtonVO> buttons) {
        this.buttons = buttons;
    }

    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }
    
    public void setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
    }

    public Boolean getClosable() {
        return this.closable;
    }
    
    public void setClosable(Boolean closable) {
        this.closable = closable;
    }

    public Integer getDuration() {
        return this.duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getPriority() {
        return this.priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
