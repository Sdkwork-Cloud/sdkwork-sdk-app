package types

// 检测类型配置
type DetectionTypeConfig struct {
	Type string `json:"type"`
	Name string `json:"name"`
	Enabled bool `json:"enabled"`
	Sensitivity string `json:"sensitivity"`
	Threshold float64 `json:"threshold"`
}
