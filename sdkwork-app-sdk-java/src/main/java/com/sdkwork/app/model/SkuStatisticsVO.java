package com.sdkwork.app.model;

public class SkuStatisticsVO {
    private String createdAt;
    private String updatedAt;
    private String productId;
    private String productName;
    private Integer totalSkuCount;
    private Integer enabledSkuCount;
    private Integer disabledSkuCount;
    private Integer totalStock;
    private Integer totalSales;
    private Double averagePrice;
    private Integer warningStockCount;
    private Map<String, Integer> stockTrend;
    private Map<String, Integer> salesTrend;

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

    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getTotalSkuCount() {
        return this.totalSkuCount;
    }
    
    public void setTotalSkuCount(Integer totalSkuCount) {
        this.totalSkuCount = totalSkuCount;
    }

    public Integer getEnabledSkuCount() {
        return this.enabledSkuCount;
    }
    
    public void setEnabledSkuCount(Integer enabledSkuCount) {
        this.enabledSkuCount = enabledSkuCount;
    }

    public Integer getDisabledSkuCount() {
        return this.disabledSkuCount;
    }
    
    public void setDisabledSkuCount(Integer disabledSkuCount) {
        this.disabledSkuCount = disabledSkuCount;
    }

    public Integer getTotalStock() {
        return this.totalStock;
    }
    
    public void setTotalStock(Integer totalStock) {
        this.totalStock = totalStock;
    }

    public Integer getTotalSales() {
        return this.totalSales;
    }
    
    public void setTotalSales(Integer totalSales) {
        this.totalSales = totalSales;
    }

    public Double getAveragePrice() {
        return this.averagePrice;
    }
    
    public void setAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Integer getWarningStockCount() {
        return this.warningStockCount;
    }
    
    public void setWarningStockCount(Integer warningStockCount) {
        this.warningStockCount = warningStockCount;
    }

    public Map<String, Integer> getStockTrend() {
        return this.stockTrend;
    }
    
    public void setStockTrend(Map<String, Integer> stockTrend) {
        this.stockTrend = stockTrend;
    }

    public Map<String, Integer> getSalesTrend() {
        return this.salesTrend;
    }
    
    public void setSalesTrend(Map<String, Integer> salesTrend) {
        this.salesTrend = salesTrend;
    }
}
