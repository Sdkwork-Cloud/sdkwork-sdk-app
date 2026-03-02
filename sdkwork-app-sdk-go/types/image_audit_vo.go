package types

// 图片审核响应
type ImageAuditVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	Result string `json:"result"`
	RiskLevel string `json:"riskLevel"`
	Confidence float64 `json:"confidence"`
	Details []ImageDetectionDetail `json:"details"`
	ViolationRegions []Region `json:"violationRegions"`
	Suggestion string `json:"suggestion"`
}
