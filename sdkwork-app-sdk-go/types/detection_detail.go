package types

// 检测结果详情
type DetectionDetail struct {
	Type string `json:"type"`
	Hit bool `json:"hit"`
	Confidence float64 `json:"confidence"`
	Keywords []string `json:"keywords"`
}
