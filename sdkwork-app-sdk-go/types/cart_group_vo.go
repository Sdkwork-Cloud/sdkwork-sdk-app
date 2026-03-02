package types

// 购物车分组响应
type CartGroupVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Items []CartItemVO `json:"items"`
	TotalQuantity int `json:"totalQuantity"`
	TotalPrice float64 `json:"totalPrice"`
}
