package types

// 订单商品项
type OrderItemForm struct {
	ProductId string `json:"productId"`
	SkuId string `json:"skuId"`
	Quantity int `json:"quantity"`
	Price string `json:"price"`
	ProductName string `json:"productName"`
	ContentType string `json:"contentType"`
	ContentId string `json:"contentId"`
}
