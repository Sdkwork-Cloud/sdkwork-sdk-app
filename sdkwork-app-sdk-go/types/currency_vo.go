package types

// 货币响应
type CurrencyVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Code string `json:"code"`
	Name string `json:"name"`
	Symbol string `json:"symbol"`
	CurrencyType string `json:"currencyType"`
	PrecisionDigits int `json:"precisionDigits"`
	IsActive bool `json:"isActive"`
	Description string `json:"description"`
}
