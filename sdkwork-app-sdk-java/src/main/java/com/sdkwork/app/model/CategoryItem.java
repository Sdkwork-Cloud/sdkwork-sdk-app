package com.sdkwork.app.model;

public class CategoryItem {
    private String id;
    private String name;
    private String description;
    private String parentId;
    private List<CategoryItem> subcategories;
    private List<String> tags;

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
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

    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<CategoryItem> getSubcategories() {
        return this.subcategories;
    }
    
    public void setSubcategories(List<CategoryItem> subcategories) {
        this.subcategories = subcategories;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
