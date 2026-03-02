package types

// 事件统计VO
type EventStatsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	EventName string `json:"eventName"`
	TotalCount int `json:"totalCount"`
	AveragePerUser float64 `json:"averagePerUser"`
	HourlyStats map[string]int `json:"hourlyStats"`
	DailyStats map[string]int `json:"dailyStats"`
	TopProperties map[string]interface{} `json:"topProperties"`
}
