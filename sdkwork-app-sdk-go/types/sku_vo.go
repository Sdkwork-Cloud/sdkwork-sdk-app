package types

// SKU信息
type SkuVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	ProductId string `json:"productId"`
	SkuCode string `json:"skuCode"`
	SkuName string `json:"skuName"`
	Attributes map[string]string `json:"attributes"`
	Price float64 `json:"price"`
	OriginalPrice float64 `json:"originalPrice"`
	Stock int `json:"stock"`
	Sales int `json:"sales"`
	Image string `json:"image"`
	Status string `json:"status"`
	Sort int `json:"sort"`
}
