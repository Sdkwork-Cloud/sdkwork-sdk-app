package types

// 取消订单请求
type OrderCancelForm struct {
	OrderId string `json:"orderId"`
	CancelReason string `json:"cancelReason"`
	Reason string `json:"reason"`
	CancelType string `json:"cancelType"`
}
