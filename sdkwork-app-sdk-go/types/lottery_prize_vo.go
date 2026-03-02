package types

// 中奖奖品记录
type LotteryPrizeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RecordId string `json:"recordId"`
	LotteryId string `json:"lotteryId"`
	LotteryTitle string `json:"lotteryTitle"`
	PrizeId string `json:"prizeId"`
	PrizeName string `json:"prizeName"`
	PrizeImage string `json:"prizeImage"`
	PrizeType string `json:"prizeType"`
	IsGrandPrize bool `json:"isGrandPrize"`
	WinTime string `json:"winTime"`
	ClaimStatus string `json:"claimStatus"`
	ClaimTime string `json:"claimTime"`
	ExpireTime string `json:"expireTime"`
	CanClaim bool `json:"canClaim"`
}
