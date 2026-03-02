package types

// 音乐统计响应
type MusicStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalMusic int `json:"totalMusic"`
	CompletedMusic int `json:"completedMusic"`
	ProcessingMusic int `json:"processingMusic"`
}
