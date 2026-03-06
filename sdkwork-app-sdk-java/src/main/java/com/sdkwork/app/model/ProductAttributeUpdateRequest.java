package com.sdkwork.app.model;

public class ProductAttributeUpdateRequest {
    private String name;
    private List<String> values;
    private Boolean searchable;
    private Boolean filterable;
    private Integer sort;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValues() {
        return this.values;
    }
    
    public void setValues(List<String> values) {
        this.values = values;
    }

    public Boolean getSearchable() {
        return this.searchable;
    }
    
    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public Boolean getFilterable() {
        return this.filterable;
    }
    
    public void setFilterable(Boolean filterable) {
        this.filterable = filterable;
    }

    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
