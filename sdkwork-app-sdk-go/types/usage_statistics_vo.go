package types

// 使用统计响应
type UsageStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TodayUsage int `json:"todayUsage"`
	WeekUsage int `json:"weekUsage"`
	MonthUsage int `json:"monthUsage"`
	TotalUsage int `json:"totalUsage"`
	AvgDailyUsage float64 `json:"avgDailyUsage"`
	MaxDailyUsage int `json:"maxDailyUsage"`
	Frequency UsageFrequencyVO `json:"frequency"`
	TimeDistribution UsageTimeDistributionVO `json:"timeDistribution"`
}
