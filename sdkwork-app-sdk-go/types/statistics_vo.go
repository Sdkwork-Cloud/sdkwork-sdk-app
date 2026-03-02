package types

// 统计信息
type StatisticsVO struct {
	TotalProjects int `json:"totalProjects"`
	TotalGenerations int `json:"totalGenerations"`
	TotalUsageTime int `json:"totalUsageTime"`
	Storage StorageStatisticsVO `json:"storage"`
	DailyUsage DailyUsageVO `json:"dailyUsage"`
}
