package types

// 视频审核状态响应
type VideoAuditStatusVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	Status string `json:"status"`
	Progress int `json:"progress"`
	ProcessedDuration int `json:"processedDuration"`
	TotalDuration int `json:"totalDuration"`
	Detections []FrameDetection `json:"detections"`
	EstimatedCompleteTime string `json:"estimatedCompleteTime"`
}
