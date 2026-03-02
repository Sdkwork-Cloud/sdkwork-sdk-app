package types

// 使用时段分布
type UsageTimeDistributionVO struct {
	Midnight int `json:"midnight"`
	Morning int `json:"morning"`
	Afternoon int `json:"afternoon"`
	Evening int `json:"evening"`
}
