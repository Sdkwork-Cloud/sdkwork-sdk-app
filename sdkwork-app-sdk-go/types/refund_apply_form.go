package types

// 申请退款请求
type RefundApplyForm struct {
	OrderId string `json:"orderId"`
	RefundAmount string `json:"refundAmount"`
	RefundReason string `json:"refundReason"`
	Reason string `json:"reason"`
	RefundType string `json:"refundType"`
	ProofImage string `json:"proofImage"`
}
