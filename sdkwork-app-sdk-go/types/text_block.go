package types

// 文字块
type TextBlock struct {
	Text string `json:"text"`
	Region Region `json:"region"`
	Confidence float64 `json:"confidence"`
}
