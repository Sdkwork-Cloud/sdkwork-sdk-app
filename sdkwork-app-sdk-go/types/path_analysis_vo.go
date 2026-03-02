package types

// 路径分析VO
type PathAnalysisVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	StartPage string `json:"startPage"`
	EndPage string `json:"endPage"`
	Steps []PathStepVO `json:"steps"`
	TotalUsers int `json:"totalUsers"`
	AverageSteps float64 `json:"averageSteps"`
	ConversionRate float64 `json:"conversionRate"`
}
