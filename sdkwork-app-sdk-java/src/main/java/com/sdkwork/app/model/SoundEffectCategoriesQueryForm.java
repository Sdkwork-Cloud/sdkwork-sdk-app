package com.sdkwork.app.model;

public class SoundEffectCategoriesQueryForm {
    private String parentCategory;
    private String language;
    private Boolean includeSubcategories;

    public String getParentCategory() {
        return this.parentCategory;
    }
    
    public void setParentCategory(String parentCategory) {
        this.parentCategory = parentCategory;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getIncludeSubcategories() {
        return this.includeSubcategories;
    }
    
    public void setIncludeSubcategories(Boolean includeSubcategories) {
        this.includeSubcategories = includeSubcategories;
    }
}
