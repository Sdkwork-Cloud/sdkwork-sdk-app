package types

// 创建汇率表单
type ExchangeRateCreateForm struct {
	BaseCurrencyCode string `json:"baseCurrencyCode"`
	TargetCurrencyCode string `json:"targetCurrencyCode"`
	Rate float64 `json:"rate"`
	EffectiveDate string `json:"effectiveDate"`
}
