package com.sdkwork.app.model;

public class ProductVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String title;
    private String type;
    private String summary;
    private String mainImage;
    private Double price;
    private Double originalPrice;
    private Integer sales;
    private String status;
    private Boolean recommended;
    private Boolean hot;
    private String categoryName;
    private String brandName;
    private List<String> tags;

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

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getMainImage() {
        return this.mainImage;
    }
    
    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getOriginalPrice() {
        return this.originalPrice;
    }
    
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getSales() {
        return this.sales;
    }
    
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getRecommended() {
        return this.recommended;
    }
    
    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }

    public Boolean getHot() {
        return this.hot;
    }
    
    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getBrandName() {
        return this.brandName;
    }
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
