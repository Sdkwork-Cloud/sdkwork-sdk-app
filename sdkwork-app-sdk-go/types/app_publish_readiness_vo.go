package types

// 应用发布就绪状态
type AppPublishReadinessVO struct {
	Ready bool `json:"ready"`
	MissingFields []string `json:"missingFields"`
	Stores []AppStorePublishReadinessVO `json:"stores"`
}
