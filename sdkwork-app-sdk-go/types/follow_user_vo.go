package types

// 关注用户响应
type FollowUserVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId string `json:"userId"`
	Username string `json:"username"`
	Nickname string `json:"nickname"`
	Avatar string `json:"avatar"`
	FollowTime string `json:"followTime"`
	IsMutual bool `json:"isMutual"`
}
