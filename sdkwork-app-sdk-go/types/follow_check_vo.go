package types

// 关注检查响应
type FollowCheckVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	IsFollowing bool `json:"isFollowing"`
	FollowTime string `json:"followTime"`
	IsFollowedBy bool `json:"isFollowedBy"`
}
