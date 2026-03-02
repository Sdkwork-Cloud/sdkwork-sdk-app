package com.sdkwork.app.model;

public class FrequencyStats {
    private Integer currentFrequency;
    private Integer avgFrequency;
    private Integer limit;
    private Double excessRatio;

    public Integer getCurrentFrequency() {
        return this.currentFrequency;
    }
    
    public void setCurrentFrequency(Integer currentFrequency) {
        this.currentFrequency = currentFrequency;
    }

    public Integer getAvgFrequency() {
        return this.avgFrequency;
    }
    
    public void setAvgFrequency(Integer avgFrequency) {
        this.avgFrequency = avgFrequency;
    }

    public Integer getLimit() {
        return this.limit;
    }
    
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Double getExcessRatio() {
        return this.excessRatio;
    }
    
    public void setExcessRatio(Double excessRatio) {
        this.excessRatio = excessRatio;
    }
}
