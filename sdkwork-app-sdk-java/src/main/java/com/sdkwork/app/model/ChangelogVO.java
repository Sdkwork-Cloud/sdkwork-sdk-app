package com.sdkwork.app.model;

public class ChangelogVO {
    private String createdAt;
    private String updatedAt;
    private String version;
    private String releaseDate;
    private String title;
    private List<String> features;
    private List<String> bugFixes;
    private List<String> improvements;
    private String status;
    private String downloadUrl;

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

    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }
    
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getFeatures() {
        return this.features;
    }
    
    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public List<String> getBugFixes() {
        return this.bugFixes;
    }
    
    public void setBugFixes(List<String> bugFixes) {
        this.bugFixes = bugFixes;
    }

    public List<String> getImprovements() {
        return this.improvements;
    }
    
    public void setImprovements(List<String> improvements) {
        this.improvements = improvements;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
