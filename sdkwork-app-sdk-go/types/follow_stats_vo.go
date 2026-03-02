package types

// 关注统计响应
type FollowStatsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	FollowingCount int `json:"followingCount"`
	FollowersCount int `json:"followersCount"`
	MutualCount int `json:"mutualCount"`
}
