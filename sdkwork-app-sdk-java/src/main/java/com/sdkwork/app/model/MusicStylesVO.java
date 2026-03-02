package com.sdkwork.app.model;

public class MusicStylesVO {
    private String createdAt;
    private String updatedAt;
    private List<GenreVO> genres;
    private List<StyleVO> styles;
    private List<MoodVO> moods;
    private List<InstrumentVO> instruments;

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

    public List<GenreVO> getGenres() {
        return this.genres;
    }
    
    public void setGenres(List<GenreVO> genres) {
        this.genres = genres;
    }

    public List<StyleVO> getStyles() {
        return this.styles;
    }
    
    public void setStyles(List<StyleVO> styles) {
        this.styles = styles;
    }

    public List<MoodVO> getMoods() {
        return this.moods;
    }
    
    public void setMoods(List<MoodVO> moods) {
        this.moods = moods;
    }

    public List<InstrumentVO> getInstruments() {
        return this.instruments;
    }
    
    public void setInstruments(List<InstrumentVO> instruments) {
        this.instruments = instruments;
    }
}
