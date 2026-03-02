package types

// 订单支付请求
type OrderPayForm struct {
	OrderId string `json:"orderId"`
	PaymentMethod string `json:"paymentMethod"`
	Amount string `json:"amount"`
	PaymentPassword string `json:"paymentPassword"`
	ClientIp string `json:"clientIp"`
}
