package types

// 漏斗分析VO
type FunnelAnalysisVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	FunnelName string `json:"funnelName"`
	Steps []FunnelStepVO `json:"steps"`
	OverallConversionRate float64 `json:"overallConversionRate"`
	TotalUsers int `json:"totalUsers"`
	ConvertedUsers int `json:"convertedUsers"`
}
