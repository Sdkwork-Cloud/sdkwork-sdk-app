package com.sdkwork.app.model;

public class CollectionUpdateForm {
    private String name;
    private String description;
    private String coverImage;

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

    public String getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }
}
