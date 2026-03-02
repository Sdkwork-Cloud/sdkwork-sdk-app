package com.sdkwork.app.model;

public class NoteFolderVO {
    private String createdAt;
    private String updatedAt;
    private Integer id;
    private String uuid;
    private String name;
    private Integer parentId;
    private String parentName;
    private String path;
    private Integer subFolderCount;
    private Integer noteCount;
    private List<NoteFolderVO> children;

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

    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return this.parentName;
    }
    
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }

    public Integer getSubFolderCount() {
        return this.subFolderCount;
    }
    
    public void setSubFolderCount(Integer subFolderCount) {
        this.subFolderCount = subFolderCount;
    }

    public Integer getNoteCount() {
        return this.noteCount;
    }
    
    public void setNoteCount(Integer noteCount) {
        this.noteCount = noteCount;
    }

    public List<NoteFolderVO> getChildren() {
        return this.children;
    }
    
    public void setChildren(List<NoteFolderVO> children) {
        this.children = children;
    }
}
