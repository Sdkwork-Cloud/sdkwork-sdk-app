package com.sdkwork.app.model;

public class VoiceSpeakerListQueryForm {
    private String gender;
    private String language;
    private String style;
    private String ageRange;
    private Integer pageNum;
    private Integer pageSize;
    private Boolean onlyFavorite;

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }

    public String getAgeRange() {
        return this.ageRange;
    }
    
    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }
    
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }
    
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getOnlyFavorite() {
        return this.onlyFavorite;
    }
    
    public void setOnlyFavorite(Boolean onlyFavorite) {
        this.onlyFavorite = onlyFavorite;
    }
}
