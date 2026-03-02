package types

// 支付响应
type PaymentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PaymentOrderId string `json:"paymentOrderId"`
	MerchantOrderId string `json:"merchantOrderId"`
	Status string `json:"status"`
	Amount string `json:"amount"`
	PaymentMethod string `json:"paymentMethod"`
	PaymentUrl string `json:"paymentUrl"`
	QrCode string `json:"qrCode"`
	PaymentId int `json:"paymentId"`
	PaymentSn string `json:"paymentSn"`
	OrderId int `json:"orderId"`
	Subject string `json:"subject"`
	PaymentProvider string `json:"paymentProvider"`
	PaymentProviderName string `json:"paymentProviderName"`
	ProductType string `json:"productType"`
	ProductTypeName string `json:"productTypeName"`
	StatusName string `json:"statusName"`
	ExpireTime string `json:"expireTime"`
	NeedQuery bool `json:"needQuery"`
	QueryInterval int `json:"queryInterval"`
	Remark string `json:"remark"`
	PaymentParams map[string]interface{} `json:"paymentParams"`
	TransactionId string `json:"transactionId"`
	OutTradeNo string `json:"outTradeNo"`
	SuccessTime string `json:"successTime"`
}
