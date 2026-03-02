package types

// 订单商品项
type OrderItemForm struct {
	ProductId string `json:"productId"`
	Quantity int `json:"quantity"`
	Price string `json:"price"`
	ProductName string `json:"productName"`
}
