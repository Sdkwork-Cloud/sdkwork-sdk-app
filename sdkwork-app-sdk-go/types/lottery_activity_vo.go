package types

// 抽奖活动
type LotteryActivityVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Title string `json:"title"`
	CoverImage string `json:"coverImage"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	FreeDrawCount int `json:"freeDrawCount"`
	PointsCost int `json:"pointsCost"`
	PrizePreview []PrizePreview `json:"prizePreview"`
	CanDraw bool `json:"canDraw"`
}
