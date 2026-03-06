package com.sdkwork.app.model;

public class NoteBatchUpdateRequest {
    private List<NoteBatchOperationRequest> requests;
    private Boolean strict;

    public List<NoteBatchOperationRequest> getRequests() {
        return this.requests;
    }
    
    public void setRequests(List<NoteBatchOperationRequest> requests) {
        this.requests = requests;
    }

    public Boolean getStrict() {
        return this.strict;
    }
    
    public void setStrict(Boolean strict) {
        this.strict = strict;
    }
}
