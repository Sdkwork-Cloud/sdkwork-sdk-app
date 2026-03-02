package types

// 支付状态响应
type PaymentStatusVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PaymentOrderId string `json:"paymentOrderId"`
	MerchantOrderId string `json:"merchantOrderId"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	Amount string `json:"amount"`
	PayTime int `json:"payTime"`
	PaymentMethod string `json:"paymentMethod"`
	PaymentId int `json:"paymentId"`
	PaymentSn string `json:"paymentSn"`
	OrderId int `json:"orderId"`
	PaymentProvider string `json:"paymentProvider"`
	TransactionId string `json:"transactionId"`
	OutTradeNo string `json:"outTradeNo"`
	SuccessTime string `json:"successTime"`
}
