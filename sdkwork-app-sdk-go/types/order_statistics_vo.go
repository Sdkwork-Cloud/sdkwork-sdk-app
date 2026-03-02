package types

// 订单统计响应
type OrderStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalOrders int `json:"totalOrders"`
	PendingPayment int `json:"pendingPayment"`
	PendingShipment int `json:"pendingShipment"`
	PendingReceipt int `json:"pendingReceipt"`
	Completed int `json:"completed"`
	TotalAmount string `json:"totalAmount"`
}
