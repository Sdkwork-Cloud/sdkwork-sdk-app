package types

// 存储类型分布
type StorageTypeDistributionVO struct {
	Text float64 `json:"text"`
	Image float64 `json:"image"`
	Audio float64 `json:"audio"`
	Video float64 `json:"video"`
	Other float64 `json:"other"`
}
