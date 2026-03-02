package types

// SKU统计响应
type SkuStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ProductId string `json:"productId"`
	ProductName string `json:"productName"`
	TotalSkuCount int `json:"totalSkuCount"`
	EnabledSkuCount int `json:"enabledSkuCount"`
	DisabledSkuCount int `json:"disabledSkuCount"`
	TotalStock int `json:"totalStock"`
	TotalSales int `json:"totalSales"`
	AveragePrice float64 `json:"averagePrice"`
	WarningStockCount int `json:"warningStockCount"`
	StockTrend map[string]int `json:"stockTrend"`
	SalesTrend map[string]int `json:"salesTrend"`
}
