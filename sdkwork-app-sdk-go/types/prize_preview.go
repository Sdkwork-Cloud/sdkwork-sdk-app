package types

// 奖品预览
type PrizePreview struct {
	Name string `json:"name"`
	Image string `json:"image"`
	IsGrandPrize bool `json:"isGrandPrize"`
}
