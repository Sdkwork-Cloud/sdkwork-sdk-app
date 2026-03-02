package types

// UI配置响应
type UiConfigVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ConfigKey string `json:"configKey"`
	ConfigName string `json:"configName"`
	UiConfig map[string]interface{} `json:"uiConfig"`
	Version string `json:"version"`
}
