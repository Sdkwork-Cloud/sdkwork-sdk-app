package com.sdkwork.app.model;

public class SoundEffectCategoriesVO {
    private String createdAt;
    private String updatedAt;
    private List<CategoryItem> categories;

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

    public List<CategoryItem> getCategories() {
        return this.categories;
    }
    
    public void setCategories(List<CategoryItem> categories) {
        this.categories = categories;
    }
}
