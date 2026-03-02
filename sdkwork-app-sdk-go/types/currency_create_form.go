package types

// 创建货币表单
type CurrencyCreateForm struct {
	Code string `json:"code"`
	Name string `json:"name"`
	Symbol string `json:"symbol"`
	CurrencyType string `json:"currencyType"`
	PrecisionDigits int `json:"precisionDigits"`
	IsActive bool `json:"isActive"`
	Description string `json:"description"`
}
