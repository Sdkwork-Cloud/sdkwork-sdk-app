package com.sdkwork.app.model;

public class DocumentBatchUpdateRequest {
    private List<DocumentBatchOperationRequest> requests;
    private Boolean strict;

    public List<DocumentBatchOperationRequest> getRequests() {
        return this.requests;
    }
    
    public void setRequests(List<DocumentBatchOperationRequest> requests) {
        this.requests = requests;
    }

    public Boolean getStrict() {
        return this.strict;
    }
    
    public void setStrict(Boolean strict) {
        this.strict = strict;
    }
}
