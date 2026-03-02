package com.sdkwork.app.model;

public class BatchTextAuditForm {
    private List<TextItem> items;
    private List<String> checkTypes;
    private String scene;

    public List<TextItem> getItems() {
        return this.items;
    }
    
    public void setItems(List<TextItem> items) {
        this.items = items;
    }

    public List<String> getCheckTypes() {
        return this.checkTypes;
    }
    
    public void setCheckTypes(List<String> checkTypes) {
        this.checkTypes = checkTypes;
    }

    public String getScene() {
        return this.scene;
    }
    
    public void setScene(String scene) {
        this.scene = scene;
    }
}
