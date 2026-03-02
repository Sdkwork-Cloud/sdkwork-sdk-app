package com.sdkwork.app.model;

public class NewsVO {
    private String createdAt;
    private String updatedAt;
    private String newsId;
    private String title;
    private String summary;
    private String url;
    private String source;
    private Integer categoryId;
    private String publishTime;

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

    public String getNewsId() {
        return this.newsId;
    }
    
    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getPublishTime() {
        return this.publishTime;
    }
    
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }
}
