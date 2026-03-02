package types

// 视频统计响应
type VideoStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalVideos int `json:"totalVideos"`
	CompletedVideos int `json:"completedVideos"`
	ProcessingVideos int `json:"processingVideos"`
}
