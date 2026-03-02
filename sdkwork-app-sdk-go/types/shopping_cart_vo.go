package types

// 购物车响应
type ShoppingCartVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CartId string `json:"cartId"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Description string `json:"description"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Status string `json:"status"`
	Groups []CartGroupVO `json:"groups"`
	TotalQuantity int `json:"totalQuantity"`
	TotalPrice float64 `json:"totalPrice"`
	SelectedQuantity int `json:"selectedQuantity"`
	SelectedPrice float64 `json:"selectedPrice"`
}
