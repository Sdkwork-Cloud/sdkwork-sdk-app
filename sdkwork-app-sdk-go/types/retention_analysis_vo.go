package types

// 留存分析VO
type RetentionAnalysisVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RetentionType string `json:"retentionType"`
	RetentionRates map[string]float64 `json:"retentionRates"`
	AverageRetentionRate float64 `json:"averageRetentionRate"`
	TotalUsers int `json:"totalUsers"`
	CohortSizes map[string]int `json:"cohortSizes"`
}
