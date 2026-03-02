package com.sdkwork.app.model;

public class ShopCreateForm {
    private String name;
    private String description;
    private String logoUrl;
    private String coverUrl;
    private String contactPhone;
    private String contactEmail;
    private String address;
    private Double latitude;
    private Double longitude;
    private String licenseNumber;
    private List<String> tags;
    private String businessHours;

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

    public String getLogoUrl() {
        return this.logoUrl;
    }
    
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }
    
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }
    
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }
    
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLatitude() {
        return this.latitude;
    }
    
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }
    
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }
    
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getBusinessHours() {
        return this.businessHours;
    }
    
    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }
}
