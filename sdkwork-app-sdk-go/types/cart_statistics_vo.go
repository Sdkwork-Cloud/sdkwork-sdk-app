package types

// 购物车统计响应
type CartStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CartId string `json:"cartId"`
	ItemCount int `json:"itemCount"`
	TotalQuantity int `json:"totalQuantity"`
	TotalPrice float64 `json:"totalPrice"`
	SelectedItemCount int `json:"selectedItemCount"`
	SelectedQuantity int `json:"selectedQuantity"`
	SelectedPrice float64 `json:"selectedPrice"`
}
