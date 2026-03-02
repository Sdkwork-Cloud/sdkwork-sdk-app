package types

// 模型价格响应
type ModelPriceVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Model string `json:"model"`
	Unit string `json:"unit"`
	Currency string `json:"currency"`
	Price float64 `json:"price"`
	InputPrice float64 `json:"inputPrice"`
	OutputPrice float64 `json:"outputPrice"`
	BatchInputPrice float64 `json:"batchInputPrice"`
	BatchOutputPrice float64 `json:"batchOutputPrice"`
	CachedInputPrice float64 `json:"cachedInputPrice"`
	BatchCachedInputPrice float64 `json:"batchCachedInputPrice"`
}
