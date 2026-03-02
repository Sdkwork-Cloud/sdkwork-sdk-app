package types

// 风险项
type RiskItem struct {
	Type string `json:"type"`
	Name string `json:"name"`
	Description string `json:"description"`
	Level string `json:"level"`
	Confidence float64 `json:"confidence"`
}
