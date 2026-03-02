package com.sdkwork.app.model;

public class ProductDetailVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String title;
    private String type;
    private String description;
    private String summary;
    private String categoryId;
    private String categoryName;
    private String brandId;
    private String brandName;
    private List<String> tagIds;
    private List<String> tags;
    private String mainImage;
    private List<String> images;
    private String videoUrl;
    private Double price;
    private Double originalPrice;
    private Integer stock;
    private Integer sales;
    private String status;
    private Boolean recommended;
    private Boolean hot;
    private Integer sort;
    private String shelfTime;
    private String offShelfTime;
    private List<ProductAttributeVO> attributes;
    private List<SkuVO> skus;
    private Map<String, Object> reviewStatistics;

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

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getBrandId() {
        return this.brandId;
    }
    
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<String> getTagIds() {
        return this.tagIds;
    }
    
    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public List<String> getTags() {
        return this.tags;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getMainImage() {
        return this.mainImage;
    }
    
    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public List<String> getImages() {
        return this.images;
    }
    
    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }
    
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
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

    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
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

    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getShelfTime() {
        return this.shelfTime;
    }
    
    public void setShelfTime(String shelfTime) {
        this.shelfTime = shelfTime;
    }

    public String getOffShelfTime() {
        return this.offShelfTime;
    }
    
    public void setOffShelfTime(String offShelfTime) {
        this.offShelfTime = offShelfTime;
    }

    public List<ProductAttributeVO> getAttributes() {
        return this.attributes;
    }
    
    public void setAttributes(List<ProductAttributeVO> attributes) {
        this.attributes = attributes;
    }

    public List<SkuVO> getSkus() {
        return this.skus;
    }
    
    public void setSkus(List<SkuVO> skus) {
        this.skus = skus;
    }

    public Map<String, Object> getReviewStatistics() {
        return this.reviewStatistics;
    }
    
    public void setReviewStatistics(Map<String, Object> reviewStatistics) {
        this.reviewStatistics = reviewStatistics;
    }
}
