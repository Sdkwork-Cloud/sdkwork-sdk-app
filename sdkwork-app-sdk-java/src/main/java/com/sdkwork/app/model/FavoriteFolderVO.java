package com.sdkwork.app.model;

public class FavoriteFolderVO {
    private String createdAt;
    private String updatedAt;
    private String folderId;
    private String folderName;
    private String parentFolderId;
    private String folderDescription;
    private List<FavoriteFolderVO> subFolders;
    private List<FavoriteItemVO> favoriteItems;
    private String createTime;
    private String updateTime;
    private Integer favoriteCount;

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

    public String getFolderId() {
        return this.folderId;
    }
    
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getFolderName() {
        return this.folderName;
    }
    
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getParentFolderId() {
        return this.parentFolderId;
    }
    
    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    public String getFolderDescription() {
        return this.folderDescription;
    }
    
    public void setFolderDescription(String folderDescription) {
        this.folderDescription = folderDescription;
    }

    public List<FavoriteFolderVO> getSubFolders() {
        return this.subFolders;
    }
    
    public void setSubFolders(List<FavoriteFolderVO> subFolders) {
        this.subFolders = subFolders;
    }

    public List<FavoriteItemVO> getFavoriteItems() {
        return this.favoriteItems;
    }
    
    public void setFavoriteItems(List<FavoriteItemVO> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getFavoriteCount() {
        return this.favoriteCount;
    }
    
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }
}
