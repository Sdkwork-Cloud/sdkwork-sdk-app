package com.sdkwork.app.model;

public class ShortcutVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String name;
    private String icon;
    private String url;
    private String type;
    private Integer sort;
    private String group;
    private String description;
    private Boolean isDefault;
    private Boolean enabled;
    private Integer usageCount;
    private String lastUsedAt;

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

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getGroup() {
        return this.group;
    }
    
    public void setGroup(String group) {
        this.group = group;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }
    
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getUsageCount() {
        return this.usageCount;
    }
    
    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public String getLastUsedAt() {
        return this.lastUsedAt;
    }
    
    public void setLastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }
}
