package types

// 最近中奖者
type RecentWinner struct {
	Nickname string `json:"nickname"`
	PrizeName string `json:"prizeName"`
	WinTime string `json:"winTime"`
}
