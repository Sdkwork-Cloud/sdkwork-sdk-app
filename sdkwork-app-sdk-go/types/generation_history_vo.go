package types

// 生成历史响应
type GenerationHistoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Type string `json:"type"`
	TaskId string `json:"taskId"`
	Title string `json:"title"`
	Description string `json:"description"`
	Status string `json:"status"`
	Duration int `json:"duration"`
	ResultUrl string `json:"resultUrl"`
	ResultPreview string `json:"resultPreview"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	ModelName string `json:"modelName"`
	TokenUsage int `json:"tokenUsage"`
}
