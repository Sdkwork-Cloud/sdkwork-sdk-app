package types

// 存储增长趋势
type StorageTrendVO struct {
	Last7Days int `json:"last7Days"`
	Last30Days int `json:"last30Days"`
	Last90Days int `json:"last90Days"`
	AvgDailyGrowth int `json:"avgDailyGrowth"`
}
