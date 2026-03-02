package com.sdkwork.app.model;

public class ExperimentResultsVO {
    private String createdAt;
    private String updatedAt;
    private String experimentKey;
    private List<Map<String, Object>> results;
    private Map<String, Object> statistics;
    private String status;
    private String generatedAt;

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

    public String getExperimentKey() {
        return this.experimentKey;
    }
    
    public void setExperimentKey(String experimentKey) {
        this.experimentKey = experimentKey;
    }

    public List<Map<String, Object>> getResults() {
        return this.results;
    }
    
    public void setResults(List<Map<String, Object>> results) {
        this.results = results;
    }

    public Map<String, Object> getStatistics() {
        return this.statistics;
    }
    
    public void setStatistics(Map<String, Object> statistics) {
        this.statistics = statistics;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getGeneratedAt() {
        return this.generatedAt;
    }
    
    public void setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
    }
}
