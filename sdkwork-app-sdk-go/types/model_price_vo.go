package types

// Model pricing rule
type ModelPriceVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Model string `json:"model"`
	ModelId int `json:"modelId"`
	ModelKey string `json:"modelKey"`
	Channel string `json:"channel"`
	ProductCode string `json:"productCode"`
	FeatureCode string `json:"featureCode"`
	BillingType string `json:"billingType"`
	PriceItemType string `json:"priceItemType"`
	TierName string `json:"tierName"`
	RulePriority int `json:"rulePriority"`
	Unit string `json:"unit"`
	UnitSize float64 `json:"unitSize"`
	Currency string `json:"currency"`
	Price float64 `json:"price"`
	InputPrice float64 `json:"inputPrice"`
	OutputPrice float64 `json:"outputPrice"`
	BatchInputPrice float64 `json:"batchInputPrice"`
	BatchOutputPrice float64 `json:"batchOutputPrice"`
	CachedInputPrice float64 `json:"cachedInputPrice"`
	BatchCachedInputPrice float64 `json:"batchCachedInputPrice"`
	MinUsage float64 `json:"minUsage"`
	MaxUsage float64 `json:"maxUsage"`
	EffectiveFrom string `json:"effectiveFrom"`
	EffectiveTo string `json:"effectiveTo"`
	DefaultRule bool `json:"defaultRule"`
	Status string `json:"status"`
	Metadata map[string]interface{} `json:"metadata"`
}
