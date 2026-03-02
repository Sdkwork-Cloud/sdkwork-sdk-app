package types

// 模型详情响应
type ModelInfoDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ModelId string `json:"modelId"`
	Model string `json:"model"`
	Name string `json:"name"`
	Description string `json:"description"`
	Channel string `json:"channel"`
	Vendor string `json:"vendor"`
	ModelType string `json:"modelType"`
	Family string `json:"family"`
	Version string `json:"version"`
	OpenSource bool `json:"openSource"`
	ApiEndpoint string `json:"apiEndpoint"`
	OwnedBy string `json:"ownedBy"`
	Scenes SceneContent `json:"scenes"`
	Tags TagsContent `json:"tags"`
	LimitInfo ModelLimitInfo `json:"limitInfo"`
	PriceInfo ModelPrice `json:"priceInfo"`
	Metadata ModelMetadata `json:"metadata"`
	DefaultTemperature float64 `json:"defaultTemperature"`
	DefaultTopP float64 `json:"defaultTopP"`
	DefaultFrequencyPenalty float64 `json:"defaultFrequencyPenalty"`
	DefaultPresencePenalty float64 `json:"defaultPresencePenalty"`
	Status string `json:"status"`
	UsageCount int `json:"usageCount"`
	TotalTokens int `json:"totalTokens"`
	AvgResponseTime int `json:"avgResponseTime"`
}
