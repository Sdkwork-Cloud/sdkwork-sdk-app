package com.sdkwork.app.model;

public class ExperimentExposureForm {
    private String experimentKey;
    private String variantKey;
    private Object exposureContext;

    public String getExperimentKey() {
        return this.experimentKey;
    }
    
    public void setExperimentKey(String experimentKey) {
        this.experimentKey = experimentKey;
    }

    public String getVariantKey() {
        return this.variantKey;
    }
    
    public void setVariantKey(String variantKey) {
        this.variantKey = variantKey;
    }

    public Object getExposureContext() {
        return this.exposureContext;
    }
    
    public void setExposureContext(Object exposureContext) {
        this.exposureContext = exposureContext;
    }
}
