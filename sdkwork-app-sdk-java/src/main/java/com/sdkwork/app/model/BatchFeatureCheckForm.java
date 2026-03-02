package com.sdkwork.app.model;

public class BatchFeatureCheckForm {
    private List<String> featureKeys;
    private Object userAttributes;

    public List<String> getFeatureKeys() {
        return this.featureKeys;
    }
    
    public void setFeatureKeys(List<String> featureKeys) {
        this.featureKeys = featureKeys;
    }

    public Object getUserAttributes() {
        return this.userAttributes;
    }
    
    public void setUserAttributes(Object userAttributes) {
        this.userAttributes = userAttributes;
    }
}
