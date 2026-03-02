package types

// 抽奖结果
type LotteryDrawVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	IsWin bool `json:"isWin"`
	PrizeId string `json:"prizeId"`
	PrizeName string `json:"prizeName"`
	PrizeImage string `json:"prizeImage"`
	PrizeType string `json:"prizeType"`
	IsGrandPrize bool `json:"isGrandPrize"`
	WinTime string `json:"winTime"`
	RecordId string `json:"recordId"`
	RemainingFreeCount int `json:"remainingFreeCount"`
	PointsCost int `json:"pointsCost"`
	Message string `json:"message"`
}
