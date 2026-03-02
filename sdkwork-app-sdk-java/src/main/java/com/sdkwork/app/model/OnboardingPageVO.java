package com.sdkwork.app.model;

public class OnboardingPageVO {
    private String createdAt;
    private String updatedAt;
    private String pageId;
    private String title;
    private String description;
    private List<String> images;
    private List<String> buttons;
    private String backgroundColor;
    private String textColor;
    private Boolean isActive;
    private Integer order;

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

    public String getPageId() {
        return this.pageId;
    }
    
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getImages() {
        return this.images;
    }
    
    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getButtons() {
        return this.buttons;
    }
    
    public void setButtons(List<String> buttons) {
        this.buttons = buttons;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }
    
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getTextColor() {
        return this.textColor;
    }
    
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getOrder() {
        return this.order;
    }
    
    public void setOrder(Integer order) {
        this.order = order;
    }
}
