package com.sdkwork.app.model;

public class VoiceListQueryForm {
    private String language;
    private String gender;
    private String style;
    private String ageRange;

    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
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
}
