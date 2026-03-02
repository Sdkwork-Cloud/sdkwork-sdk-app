package com.sdkwork.app.model;

public class MusicStylesQueryForm {
    private String category;
    private String genre;
    private String style;
    private String mood;
    private String instrument;

    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }

    public String getMood() {
        return this.mood;
    }
    
    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getInstrument() {
        return this.instrument;
    }
    
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
