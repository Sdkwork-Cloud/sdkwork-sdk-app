package types

// 浏览统计响应
type BrowseStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalCount int `json:"totalCount"`
	TotalDuration int `json:"totalDuration"`
	AverageDuration int `json:"averageDuration"`
	TodayCount int `json:"todayCount"`
	WeeklyCount int `json:"weeklyCount"`
	MonthlyCount int `json:"monthlyCount"`
	TypeDistribution map[string]int `json:"typeDistribution"`
	SourceDistribution map[string]int `json:"sourceDistribution"`
	DailyTrend map[string]int `json:"dailyTrend"`
}
