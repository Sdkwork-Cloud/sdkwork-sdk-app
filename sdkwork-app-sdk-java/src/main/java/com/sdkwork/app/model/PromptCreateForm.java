package com.sdkwork.app.model;

public class PromptCreateForm {
    private String title;
    private String content;
    private String type;
    private String bizType;
    private String description;
    private Integer cateId;
    private Integer sort;
    private Map<String, Object> parameters;
    private String model;
    private Boolean isPublic;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getBizType() {
        return this.bizType;
    }
    
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCateId() {
        return this.cateId;
    }
    
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }
    
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }
    
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }
}
