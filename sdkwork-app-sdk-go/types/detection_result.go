package types

// 检测结果
type DetectionResult struct {
	Type string `json:"type"`
	Hit bool `json:"hit"`
	Confidence float64 `json:"confidence"`
	Keywords []string `json:"keywords"`
}
