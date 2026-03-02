package types

// 更新购物车项数量请求
type UpdateCartItemForm struct {
	Quantity int `json:"quantity"`
}
