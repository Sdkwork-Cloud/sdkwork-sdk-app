package types

// 音频审核响应
type AudioAuditVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	Result string `json:"result"`
	RiskLevel string `json:"riskLevel"`
	Duration int `json:"duration"`
	Transcript string `json:"transcript"`
	ViolationSegments []ViolationSegment `json:"violationSegments"`
	Suggestion string `json:"suggestion"`
}
