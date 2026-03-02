package com.sdkwork.app.model;

public class CharacterListVO {
    private String createdAt;
    private String updatedAt;
    private List<CharacterItem> characters;
    private Integer total;
    private Integer page;
    private Integer size;

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

    public List<CharacterItem> getCharacters() {
        return this.characters;
    }
    
    public void setCharacters(List<CharacterItem> characters) {
        this.characters = characters;
    }

    public Integer getTotal() {
        return this.total;
    }
    
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPage() {
        return this.page;
    }
    
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }
}
