package types


type PaymentParamsVO struct {
	OrderId string `json:"orderId"`
	Amount string `json:"amount"`
	PaymentMethod string `json:"paymentMethod"`
}
