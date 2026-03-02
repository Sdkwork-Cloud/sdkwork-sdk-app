package types

// 关注操作响应
type FollowVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	IsFollowing bool `json:"isFollowing"`
	UserId string `json:"userId"`
}
