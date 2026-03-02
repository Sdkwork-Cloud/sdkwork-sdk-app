package com.sdkwork.app.model;

public class BatchAssignmentForm {
    private List<String> experimentKeys;
    private Map<String, Object> userAttributes;

    public List<String> getExperimentKeys() {
        return this.experimentKeys;
    }
    
    public void setExperimentKeys(List<String> experimentKeys) {
        this.experimentKeys = experimentKeys;
    }

    public Map<String, Object> getUserAttributes() {
        return this.userAttributes;
    }
    
    public void setUserAttributes(Map<String, Object> userAttributes) {
        this.userAttributes = userAttributes;
    }
}
