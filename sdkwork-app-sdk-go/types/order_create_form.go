package types

// 创建订单请求
type OrderCreateForm struct {
	OrderType string `json:"orderType"`
	ProductId string `json:"productId"`
	Quantity int `json:"quantity"`
	Items []OrderItemForm `json:"items"`
	AddressId string `json:"addressId"`
	PaymentMethod string `json:"paymentMethod"`
	CouponId string `json:"couponId"`
	Remark string `json:"remark"`
	SourceChannel string `json:"sourceChannel"`
	RechargePoints int `json:"rechargePoints"`
}
