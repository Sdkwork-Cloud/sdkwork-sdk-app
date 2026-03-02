package com.sdkwork.app.model;

public class SensitiveWordListVO {
    private String createdAt;
    private String updatedAt;
    private String listId;
    private String name;
    private String description;
    private String type;
    private Integer wordCount;
    private List<String> categories;
    private String version;
    private Boolean enabled;

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

    public String getListId() {
        return this.listId;
    }
    
    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Integer getWordCount() {
        return this.wordCount;
    }
    
    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public List<String> getCategories() {
        return this.categories;
    }
    
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
