package com.sdkwork.app.model;

public class VipPackGroupDetailVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String name;
    private String description;
    private Integer sortWeight;
    private List<VipPackVO> packs;

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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSortWeight() {
        return this.sortWeight;
    }
    
    public void setSortWeight(Integer sortWeight) {
        this.sortWeight = sortWeight;
    }

    public List<VipPackVO> getPacks() {
        return this.packs;
    }
    
    public void setPacks(List<VipPackVO> packs) {
        this.packs = packs;
    }
}
