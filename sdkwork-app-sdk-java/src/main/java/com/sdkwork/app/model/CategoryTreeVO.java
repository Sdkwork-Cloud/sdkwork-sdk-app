package com.sdkwork.app.model;

public class CategoryTreeVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private String code;
    private String icon;
    private Integer parentId;
    private Integer sort;
    private Integer status;
    private List<CategoryTreeVO> children;

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

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<CategoryTreeVO> getChildren() {
        return this.children;
    }
    
    public void setChildren(List<CategoryTreeVO> children) {
        this.children = children;
    }
}
