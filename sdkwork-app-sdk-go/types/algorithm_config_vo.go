package types

// 算法配置响应
type AlgorithmConfigVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AlgorithmType string `json:"algorithmType"`
	AlgorithmParams interface{} `json:"algorithmParams"`
	Version string `json:"version"`
}
