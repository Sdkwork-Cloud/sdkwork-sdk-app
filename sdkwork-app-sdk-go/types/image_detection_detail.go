package types

// 图片检测详情
type ImageDetectionDetail struct {
	Type string `json:"type"`
	Hit bool `json:"hit"`
	Confidence float64 `json:"confidence"`
	SubType string `json:"subType"`
}
