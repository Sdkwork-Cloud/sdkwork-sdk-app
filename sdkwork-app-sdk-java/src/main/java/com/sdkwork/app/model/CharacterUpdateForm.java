package com.sdkwork.app.model;

public class CharacterUpdateForm {
    private String name;
    private String description;
    private String personality;
    private String background;

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

    public String getPersonality() {
        return this.personality;
    }
    
    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getBackground() {
        return this.background;
    }
    
    public void setBackground(String background) {
        this.background = background;
    }
}
