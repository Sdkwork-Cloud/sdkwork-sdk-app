package com.sdkwork.app.model;

public class GlobalSearchVO {
    private String createdAt;
    private String updatedAt;
    private List<ProjectSearchResult> projects;
    private List<AssetSearchResult> assets;
    private List<NoteSearchResult> notes;
    private List<UserSearchResult> users;

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

    public List<ProjectSearchResult> getProjects() {
        return this.projects;
    }
    
    public void setProjects(List<ProjectSearchResult> projects) {
        this.projects = projects;
    }

    public List<AssetSearchResult> getAssets() {
        return this.assets;
    }
    
    public void setAssets(List<AssetSearchResult> assets) {
        this.assets = assets;
    }

    public List<NoteSearchResult> getNotes() {
        return this.notes;
    }
    
    public void setNotes(List<NoteSearchResult> notes) {
        this.notes = notes;
    }

    public List<UserSearchResult> getUsers() {
        return this.users;
    }
    
    public void setUsers(List<UserSearchResult> users) {
        this.users = users;
    }
}
