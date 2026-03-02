package types

// 实验响应
type ExperimentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ExperimentKey string `json:"experimentKey"`
	ExperimentName string `json:"experimentName"`
	ExperimentDescription string `json:"experimentDescription"`
	Status string `json:"status"`
}
