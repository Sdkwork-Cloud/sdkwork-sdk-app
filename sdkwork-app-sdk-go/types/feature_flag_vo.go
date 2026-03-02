package types

// 特性开关响应
type FeatureFlagVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	FeatureKey string `json:"featureKey"`
	FeatureName string `json:"featureName"`
	Enabled bool `json:"enabled"`
	Value interface{} `json:"value"`
	Description string `json:"description"`
}
