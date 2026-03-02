package com.sdkwork.app.model;

public class SearchFiltersVO {
    private String createdAt;
    private String updatedAt;
    private Map<String, String> typeFilters;
    private Map<String, String> dateFilters;
    private Map<String, Object> otherFilters;

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

    public Map<String, String> getTypeFilters() {
        return this.typeFilters;
    }
    
    public void setTypeFilters(Map<String, String> typeFilters) {
        this.typeFilters = typeFilters;
    }

    public Map<String, String> getDateFilters() {
        return this.dateFilters;
    }
    
    public void setDateFilters(Map<String, String> dateFilters) {
        this.dateFilters = dateFilters;
    }

    public Map<String, Object> getOtherFilters() {
        return this.otherFilters;
    }
    
    public void setOtherFilters(Map<String, Object> otherFilters) {
        this.otherFilters = otherFilters;
    }
}
