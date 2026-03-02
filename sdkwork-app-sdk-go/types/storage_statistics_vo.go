package types

// 存储统计响应
type StorageStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalStorage int `json:"totalStorage"`
	UsedStorage int `json:"usedStorage"`
	RemainingStorage int `json:"remainingStorage"`
	UsageRate float64 `json:"usageRate"`
	TypeDistribution StorageTypeDistributionVO `json:"typeDistribution"`
	Trend StorageTrendVO `json:"trend"`
}
