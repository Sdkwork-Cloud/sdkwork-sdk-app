package types

// SKU详情
type SkuDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	ProductId string `json:"productId"`
	ProductName string `json:"productName"`
	SkuCode string `json:"skuCode"`
	SkuName string `json:"skuName"`
	Attributes map[string]string `json:"attributes"`
	Price float64 `json:"price"`
	OriginalPrice float64 `json:"originalPrice"`
	Stock int `json:"stock"`
	WarningStock int `json:"warningStock"`
	Sales int `json:"sales"`
	MainImage string `json:"mainImage"`
	Images []string `json:"images"`
	Weight float64 `json:"weight"`
	Volume float64 `json:"volume"`
	Status string `json:"status"`
	Sort int `json:"sort"`
}
