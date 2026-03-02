package com.sdkwork.app.model;

public class ShopDetailVO {
    private String createdAt;
    private String updatedAt;
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
    private String status;
    private String statusName;
    private String ownerId;
    private String ownerName;
    private Integer productCount;
    private Integer orderCount;
    private Double rating;
    private Integer followerCount;

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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        return this.statusName;
    }
    
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return this.ownerName;
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getProductCount() {
        return this.productCount;
    }
    
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getOrderCount() {
        return this.orderCount;
    }
    
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Double getRating() {
        return this.rating;
    }
    
    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getFollowerCount() {
        return this.followerCount;
    }
    
    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }
}
