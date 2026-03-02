package types

// 作废发票表单
type InvoiceCancelForm struct {
	CancelReason string `json:"cancelReason"`
}
