package types

// SKU库存响应
type SkuStockVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	SkuId string `json:"skuId"`
	ProductId string `json:"productId"`
	SkuCode string `json:"skuCode"`
	SkuName string `json:"skuName"`
	Quantity int `json:"quantity"`
	WarningStock int `json:"warningStock"`
	LockedStock int `json:"lockedStock"`
	AvailableStock int `json:"availableStock"`
	Status string `json:"status"`
}
