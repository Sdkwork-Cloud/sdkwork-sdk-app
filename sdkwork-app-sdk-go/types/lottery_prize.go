package types

// 抽奖奖品
type LotteryPrize struct {
	PrizeId string `json:"prizeId"`
	Name string `json:"name"`
	Image string `json:"image"`
	Probability string `json:"probability"`
	IsGrandPrize bool `json:"isGrandPrize"`
	RemainingCount int `json:"remainingCount"`
}
