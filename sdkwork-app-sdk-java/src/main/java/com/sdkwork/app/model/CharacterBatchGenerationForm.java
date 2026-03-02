package com.sdkwork.app.model;

public class CharacterBatchGenerationForm {
    private List<CharacterItem> characters;
    private String model;

    public List<CharacterItem> getCharacters() {
        return this.characters;
    }
    
    public void setCharacters(List<CharacterItem> characters) {
        this.characters = characters;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
}
