package types

// 汇率响应
type ExchangeRateVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	BaseCurrencyCode string `json:"baseCurrencyCode"`
	BaseCurrencyName string `json:"baseCurrencyName"`
	TargetCurrencyCode string `json:"targetCurrencyCode"`
	TargetCurrencyName string `json:"targetCurrencyName"`
	Rate float64 `json:"rate"`
	EffectiveDate string `json:"effectiveDate"`
}
