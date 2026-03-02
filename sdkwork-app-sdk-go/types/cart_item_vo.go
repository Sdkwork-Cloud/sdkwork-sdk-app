package types

// 购物车商品项响应
type CartItemVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ItemId string `json:"itemId"`
	Uuid string `json:"uuid"`
	CartId string `json:"cartId"`
	CartGroupUuid string `json:"cartGroupUuid"`
	ProductId string `json:"productId"`
	SkuId string `json:"skuId"`
	SkuName string `json:"skuName"`
	SkuCode string `json:"skuCode"`
	SkuImage string `json:"skuImage"`
	SkuPrice float64 `json:"skuPrice"`
	Quantity int `json:"quantity"`
	Price float64 `json:"price"`
	TotalPrice float64 `json:"totalPrice"`
	Selected bool `json:"selected"`
}
