package com.sdkwork.app.model;

public class ShortcutItemForm {
    private String id;
    private String name;
    private String icon;
    private String url;
    private Integer sort;
    private String type;

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

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
