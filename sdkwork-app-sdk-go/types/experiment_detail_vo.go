package types

// 实验详情响应
type ExperimentDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ExperimentKey string `json:"experimentKey"`
	ExperimentName string `json:"experimentName"`
	ExperimentDescription string `json:"experimentDescription"`
	Status string `json:"status"`
	Variants []map[string]interface{} `json:"variants"`
	Config map[string]interface{} `json:"config"`
}
