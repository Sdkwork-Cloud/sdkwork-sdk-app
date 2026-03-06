package types

// 单个商店发布就绪状态
type AppStorePublishReadinessVO struct {
	Platform string `json:"platform"`
	Ready bool `json:"ready"`
	MissingFields []string `json:"missingFields"`
}
