package types

// 应用统计响应
type AppStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalApps int `json:"totalApps"`
}
