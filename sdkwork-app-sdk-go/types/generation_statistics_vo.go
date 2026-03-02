package types

// 生成统计响应
type GenerationStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TodayCount int `json:"todayCount"`
	WeekCount int `json:"weekCount"`
	MonthCount int `json:"monthCount"`
	TotalCount int `json:"totalCount"`
	AvgGenerationTime int `json:"avgGenerationTime"`
	MaxGenerationTime int `json:"maxGenerationTime"`
	MinGenerationTime int `json:"minGenerationTime"`
	SuccessRate float64 `json:"successRate"`
	MostUsedModel string `json:"mostUsedModel"`
	TypeDistribution GenerationTypeDistributionVO `json:"typeDistribution"`
}
