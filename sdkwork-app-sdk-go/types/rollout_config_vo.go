package types

// 发布配置响应
type RolloutConfigVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RolloutKey string `json:"rolloutKey"`
	RolloutName string `json:"rolloutName"`
	Config map[string]interface{} `json:"config"`
	Status string `json:"status"`
}
