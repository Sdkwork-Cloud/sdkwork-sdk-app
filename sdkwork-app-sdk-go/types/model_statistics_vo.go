package types

// 模型统计响应
type ModelStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalModels int `json:"totalModels"`
	ActiveModels int `json:"activeModels"`
	ChatModels int `json:"chatModels"`
	ImageModels int `json:"imageModels"`
	AudioModels int `json:"audioModels"`
}
