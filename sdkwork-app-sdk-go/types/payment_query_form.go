package types

// 查询支付请求
type PaymentQueryForm struct {
	PaymentOrderId string `json:"paymentOrderId"`
	MerchantOrderId string `json:"merchantOrderId"`
	QueryType string `json:"queryType"`
	Status string `json:"status"`
	Page int `json:"page"`
	Size int `json:"size"`
}
