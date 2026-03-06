package types


type PaymentParamsVO struct {
	OrderId string `json:"orderId"`
	PaymentId string `json:"paymentId"`
	OutTradeNo string `json:"outTradeNo"`
	Amount string `json:"amount"`
	PaymentMethod string `json:"paymentMethod"`
	PaymentParams map[string]interface{} `json:"paymentParams"`
}
