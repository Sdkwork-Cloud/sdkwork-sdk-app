package types

// 货币兑换表单
type CurrencyConvertForm struct {
	BaseCurrencyCode string `json:"baseCurrencyCode"`
	TargetCurrencyCode string `json:"targetCurrencyCode"`
	Amount float64 `json:"amount"`
}
