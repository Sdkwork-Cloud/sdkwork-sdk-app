package types

// 文本审核响应
type TextAuditVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	Result string `json:"result"`
	RiskLevel string `json:"riskLevel"`
	Confidence float64 `json:"confidence"`
	Details []DetectionDetail `json:"details"`
	SensitiveWords []string `json:"sensitiveWords"`
	Suggestion string `json:"suggestion"`
	ProcessedText string `json:"processedText"`
}
