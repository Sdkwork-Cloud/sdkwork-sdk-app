package com.sdkwork.app.model;

public class ExperimentConversionForm {
    private String experimentKey;
    private String conversionGoal;
    private Double conversionValue;

    public String getExperimentKey() {
        return this.experimentKey;
    }
    
    public void setExperimentKey(String experimentKey) {
        this.experimentKey = experimentKey;
    }

    public String getConversionGoal() {
        return this.conversionGoal;
    }
    
    public void setConversionGoal(String conversionGoal) {
        this.conversionGoal = conversionGoal;
    }

    public Double getConversionValue() {
        return this.conversionValue;
    }
    
    public void setConversionValue(Double conversionValue) {
        this.conversionValue = conversionValue;
    }
}
