package com.sdkwork.app.model;

public class ChartDataVO {
    private String createdAt;
    private String updatedAt;
    private String type;
    private String title;
    private List<String> labels;
    private List<DatasetVO> datasets;
    private ChartConfigVO config;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLabels() {
        return this.labels;
    }
    
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<DatasetVO> getDatasets() {
        return this.datasets;
    }
    
    public void setDatasets(List<DatasetVO> datasets) {
        this.datasets = datasets;
    }

    public ChartConfigVO getConfig() {
        return this.config;
    }
    
    public void setConfig(ChartConfigVO config) {
        this.config = config;
    }
}
