package types

// 货币兑换响应
type CurrencyConvertVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	BaseCurrencyCode string `json:"baseCurrencyCode"`
	TargetCurrencyCode string `json:"targetCurrencyCode"`
	OriginalAmount float64 `json:"originalAmount"`
	Rate float64 `json:"rate"`
	ConvertedAmount float64 `json:"convertedAmount"`
}
