package com.sdkwork.app.model;

public class DatasetVO {
    private String label;
    private List<Object> data;
    private List<String> backgroundColor;
    private List<String> borderColor;
    private Integer borderWidth;

    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }

    public List<Object> getData() {
        return this.data;
    }
    
    public void setData(List<Object> data) {
        this.data = data;
    }

    public List<String> getBackgroundColor() {
        return this.backgroundColor;
    }
    
    public void setBackgroundColor(List<String> backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public List<String> getBorderColor() {
        return this.borderColor;
    }
    
    public void setBorderColor(List<String> borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getBorderWidth() {
        return this.borderWidth;
    }
    
    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }
}
