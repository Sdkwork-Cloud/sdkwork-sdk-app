package com.sdkwork.app.model;

public class ProductAttributeVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String name;
    private List<String> values;
    private Boolean searchable;
    private Boolean filterable;
    private Integer sort;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

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
