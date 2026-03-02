package types

// 创建支付请求
type PaymentCreateForm struct {
	OrderId string `json:"orderId"`
	BusinessType string `json:"businessType"`
	BusinessOrderId string `json:"businessOrderId"`
	Amount string `json:"amount"`
	PaymentMethod string `json:"paymentMethod"`
	PaymentScene string `json:"paymentScene"`
	ClientIp string `json:"clientIp"`
	PaymentProvider string `json:"paymentProvider"`
	ProductType string `json:"productType"`
}
