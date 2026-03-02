package com.sdkwork.app.model;

public class HistoryBatchDeleteForm {
    private List<String> historyIds;
    private String type;

    public List<String> getHistoryIds() {
        return this.historyIds;
    }
    
    public void setHistoryIds(List<String> historyIds) {
        this.historyIds = historyIds;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
