package types

// Model summary response
type ModelInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ModelId string `json:"modelId"`
	ModelKey string `json:"modelKey"`
	Model string `json:"model"`
	VendorModel string `json:"vendorModel"`
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
