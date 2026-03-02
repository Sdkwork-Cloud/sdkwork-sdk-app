package com.sdkwork.app.model;

public class BatchSelectForm {
    private List<Integer> itemIds;
    private Boolean selected;

    public List<Integer> getItemIds() {
        return this.itemIds;
    }
    
    public void setItemIds(List<Integer> itemIds) {
        this.itemIds = itemIds;
    }

    public Boolean getSelected() {
        return this.selected;
    }
    
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
