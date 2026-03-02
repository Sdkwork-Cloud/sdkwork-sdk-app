package types

// 广告配置VO
type AdvertConfigVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ConfigId string `json:"configId"`
	Enabled bool `json:"enabled"`
	MaxAdsPerHour int `json:"maxAdsPerHour"`
	MinInterval int `json:"minInterval"`
	AdNetwork string `json:"adNetwork"`
	ApiKey string `json:"apiKey"`
	Status string `json:"status"`
}
