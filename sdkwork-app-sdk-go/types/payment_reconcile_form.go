package types

// 支付补单请求
type PaymentReconcileForm struct {
	OrderId string `json:"orderId"`
	OutTradeNo string `json:"outTradeNo"`
	ReconcileType string `json:"reconcileType"`
}
