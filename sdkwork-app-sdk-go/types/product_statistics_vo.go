package types

// 产品统计
type ProductStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ProductId string `json:"productId"`
	TotalSales int `json:"totalSales"`
	TotalStock int `json:"totalStock"`
	ReviewCount int `json:"reviewCount"`
	AverageRating float64 `json:"averageRating"`
	ViewCount int `json:"viewCount"`
	FavoriteCount int `json:"favoriteCount"`
	ShareCount int `json:"shareCount"`
	SalesTrend map[string]int `json:"salesTrend"`
	StockTrend map[string]int `json:"stockTrend"`
}
