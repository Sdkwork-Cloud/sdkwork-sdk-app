package com.sdkwork.app.model;

public class ProductStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private String productId;
    private Integer totalSales;
    private Integer totalStock;
    private Integer reviewCount;
    private Double averageRating;
    private Integer viewCount;
    private Integer favoriteCount;
    private Integer shareCount;
    private Map<String, Integer> salesTrend;
    private Map<String, Integer> stockTrend;

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

    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getTotalSales() {
        return this.totalSales;
    }
    
    public void setTotalSales(Integer totalSales) {
        this.totalSales = totalSales;
    }

    public Integer getTotalStock() {
        return this.totalStock;
    }
    
    public void setTotalStock(Integer totalStock) {
        this.totalStock = totalStock;
    }

    public Integer getReviewCount() {
        return this.reviewCount;
    }
    
    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Double getAverageRating() {
        return this.averageRating;
    }
    
    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getViewCount() {
        return this.viewCount;
    }
    
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getFavoriteCount() {
        return this.favoriteCount;
    }
    
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Integer getShareCount() {
        return this.shareCount;
    }
    
    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Map<String, Integer> getSalesTrend() {
        return this.salesTrend;
    }
    
    public void setSalesTrend(Map<String, Integer> salesTrend) {
        this.salesTrend = salesTrend;
    }

    public Map<String, Integer> getStockTrend() {
        return this.stockTrend;
    }
    
    public void setStockTrend(Map<String, Integer> stockTrend) {
        this.stockTrend = stockTrend;
    }
}
