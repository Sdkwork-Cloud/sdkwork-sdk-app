package com.sdkwork.app.model;

public class ChartConfigVO {
    private Boolean showLegend;
    private Boolean showTooltip;
    private Boolean responsive;
    private Integer height;

    public Boolean getShowLegend() {
        return this.showLegend;
    }
    
    public void setShowLegend(Boolean showLegend) {
        this.showLegend = showLegend;
    }

    public Boolean getShowTooltip() {
        return this.showTooltip;
    }
    
    public void setShowTooltip(Boolean showTooltip) {
        this.showTooltip = showTooltip;
    }

    public Boolean getResponsive() {
        return this.responsive;
    }
    
    public void setResponsive(Boolean responsive) {
        this.responsive = responsive;
    }

    public Integer getHeight() {
        return this.height;
    }
    
    public void setHeight(Integer height) {
        this.height = height;
    }
}
