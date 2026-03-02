package types

// 分享统计响应
type ShareStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalShares int `json:"totalShares"`
	TotalVisits int `json:"totalVisits"`
	TodayShares int `json:"todayShares"`
	TodayVisits int `json:"todayVisits"`
	SuccessRate string `json:"successRate"`
}
