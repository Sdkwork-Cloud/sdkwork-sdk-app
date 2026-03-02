package types

// 历史统计响应
type HistoryStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	BrowseCount int `json:"browseCount"`
	OperationCount int `json:"operationCount"`
	GenerationCount int `json:"generationCount"`
	LoginCount int `json:"loginCount"`
	ActiveSessionCount int `json:"activeSessionCount"`
	TodayOperationCount int `json:"todayOperationCount"`
	WeeklyOperationCount int `json:"weeklyOperationCount"`
	MonthlyOperationCount int `json:"monthlyOperationCount"`
	MostFrequentAction string `json:"mostFrequentAction"`
	MostFrequentBrowseType string `json:"mostFrequentBrowseType"`
}
