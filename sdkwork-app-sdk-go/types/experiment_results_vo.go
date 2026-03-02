package types

// 实验结果响应
type ExperimentResultsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ExperimentKey string `json:"experimentKey"`
	Results []map[string]interface{} `json:"results"`
	Statistics map[string]interface{} `json:"statistics"`
	Status string `json:"status"`
	GeneratedAt string `json:"generatedAt"`
}
