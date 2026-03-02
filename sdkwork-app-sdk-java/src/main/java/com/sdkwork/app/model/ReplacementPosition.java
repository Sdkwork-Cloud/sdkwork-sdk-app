package com.sdkwork.app.model;

public class ReplacementPosition {
    private Integer start;
    private Integer end;
    private String original;
    private String replacement;

    public Integer getStart() {
        return this.start;
    }
    
    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return this.end;
    }
    
    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getOriginal() {
        return this.original;
    }
    
    public void setOriginal(String original) {
        this.original = original;
    }

    public String getReplacement() {
        return this.replacement;
    }
    
    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }
}
