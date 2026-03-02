package types

// 抽奖详情
type LotteryDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Title string `json:"title"`
	Description string `json:"description"`
	Rules string `json:"rules"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	FreeDrawCount int `json:"freeDrawCount"`
	RemainingFreeCount int `json:"remainingFreeCount"`
	PointsCost int `json:"pointsCost"`
	MyPoints int `json:"myPoints"`
	Prizes []LotteryPrize `json:"prizes"`
	RecentWinners []RecentWinner `json:"recentWinners"`
}
