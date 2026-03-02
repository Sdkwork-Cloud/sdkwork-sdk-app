package types

// 黑名单用户响应
type BlockedUserVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId string `json:"userId"`
	Username string `json:"username"`
	Nickname string `json:"nickname"`
	Avatar string `json:"avatar"`
	BlockTime string `json:"blockTime"`
	BlockReason string `json:"blockReason"`
}
