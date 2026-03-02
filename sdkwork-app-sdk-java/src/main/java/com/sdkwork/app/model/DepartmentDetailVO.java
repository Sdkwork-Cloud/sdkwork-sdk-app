package com.sdkwork.app.model;

public class DepartmentDetailVO {
    private String createdAt;
    private String updatedAt;
    private String name;
    private String code;
    private String description;
    private Integer ownerId;
    private Integer parentId;
    private Integer level;
    private Boolean isActive;
    private Integer sortOrder;
    private TreeNodePath treePath;
    private String fullPathName;
    private Integer managerId;
    private String phone;
    private String email;
    private Integer memberCount;
    private Integer childrenCount;

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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return this.level;
    }
    
    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getSortOrder() {
        return this.sortOrder;
    }
    
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public TreeNodePath getTreePath() {
        return this.treePath;
    }
    
    public void setTreePath(TreeNodePath treePath) {
        this.treePath = treePath;
    }

    public String getFullPathName() {
        return this.fullPathName;
    }
    
    public void setFullPathName(String fullPathName) {
        this.fullPathName = fullPathName;
    }

    public Integer getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMemberCount() {
        return this.memberCount;
    }
    
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public Integer getChildrenCount() {
        return this.childrenCount;
    }
    
    public void setChildrenCount(Integer childrenCount) {
        this.childrenCount = childrenCount;
    }
}
