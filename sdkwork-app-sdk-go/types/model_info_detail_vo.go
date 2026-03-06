package types

// Model detail response
type ModelInfoDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ModelId string `json:"modelId"`
	ModelKey string `json:"modelKey"`
	Model string `json:"model"`
	VendorModel string `json:"vendorModel"`
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
	ProductSupportInfo map[string]interface{} `json:"productSupportInfo"`
	PriceRules []ModelPriceVO `json:"priceRules"`
	DefaultTemperature float64 `json:"defaultTemperature"`
	DefaultTopP float64 `json:"defaultTopP"`
	DefaultFrequencyPenalty float64 `json:"defaultFrequencyPenalty"`
	DefaultPresencePenalty float64 `json:"defaultPresencePenalty"`
	Status string `json:"status"`
	UsageCount int `json:"usageCount"`
	TotalTokens int `json:"totalTokens"`
	AvgResponseTime int `json:"avgResponseTime"`
}
