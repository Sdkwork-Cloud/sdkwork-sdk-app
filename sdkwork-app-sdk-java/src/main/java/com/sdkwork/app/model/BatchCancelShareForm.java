package com.sdkwork.app.model;

public class BatchCancelShareForm {
    private List<String> shareIds;
    private String reason;

    public List<String> getShareIds() {
        return this.shareIds;
    }
    
    public void setShareIds(List<String> shareIds) {
        this.shareIds = shareIds;
    }

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
}
