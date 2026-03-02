package types

// 实时内容审核响应
type RealtimeAuditVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	StreamId string `json:"streamId"`
	TaskId string `json:"taskId"`
	Status string `json:"status"`
	VideoEnabled bool `json:"videoEnabled"`
	AudioEnabled bool `json:"audioEnabled"`
	PushUrl string `json:"pushUrl"`
	StartTime string `json:"startTime"`
	EstimatedEndTime string `json:"estimatedEndTime"`
}
