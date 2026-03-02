package types

// 每日使用统计
type DailyUsageVO struct {
	GenerationCount int `json:"generationCount"`
	UsageTime int `json:"usageTime"`
	StorageUsage int `json:"storageUsage"`
}
