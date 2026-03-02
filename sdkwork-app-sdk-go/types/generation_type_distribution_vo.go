package types

// 生成类型分布
type GenerationTypeDistributionVO struct {
	Text float64 `json:"text"`
	Image float64 `json:"image"`
	Audio float64 `json:"audio"`
	Video float64 `json:"video"`
	Code float64 `json:"code"`
}
