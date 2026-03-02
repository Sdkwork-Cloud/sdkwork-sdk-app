package types

// 图片统计响应
type ImageStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalImages int `json:"totalImages"`
	CompletedImages int `json:"completedImages"`
	ProcessingImages int `json:"processingImages"`
}
