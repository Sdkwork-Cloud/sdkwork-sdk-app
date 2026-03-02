package types

// 发票统计响应
type InvoiceStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalInvoices int `json:"totalInvoices"`
	PendingInvoices int `json:"pendingInvoices"`
	CompletedInvoices int `json:"completedInvoices"`
	TotalAmount float64 `json:"totalAmount"`
}
