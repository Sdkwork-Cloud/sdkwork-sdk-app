package com.sdkwork.app.model;

public class PathNode {
    private Integer id;
    private String name;
    private String code;
    private Integer level;
    private Boolean isCurrent;

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

    public Integer getLevel() {
        return this.level;
    }
    
    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getIsCurrent() {
        return this.isCurrent;
    }
    
    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }
}
