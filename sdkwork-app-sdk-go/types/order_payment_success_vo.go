package types


type OrderPaymentSuccessVO struct {
	OrderId string `json:"orderId"`
	OutTradeNo string `json:"outTradeNo"`
	Paid bool `json:"paid"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
}
