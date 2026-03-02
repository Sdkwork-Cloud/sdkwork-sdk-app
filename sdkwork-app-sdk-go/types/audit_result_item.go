package types

// 审核结果项
type AuditResultItem struct {
	Type string `json:"type"`
	Result string `json:"result"`
	RiskLevel string `json:"riskLevel"`
	Confidence float64 `json:"confidence"`
}
