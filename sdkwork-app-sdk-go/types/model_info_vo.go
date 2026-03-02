package types

// 模型信息响应
type ModelInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ModelId string `json:"modelId"`
	Model string `json:"model"`
	Name string `json:"name"`
	Description string `json:"description"`
	Channel string `json:"channel"`
	ModelType string `json:"modelType"`
	Family string `json:"family"`
	Version string `json:"version"`
	OpenSource bool `json:"openSource"`
	Status string `json:"status"`
	UsageCount int `json:"usageCount"`
}
