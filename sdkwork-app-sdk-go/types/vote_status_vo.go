package types

// 投票状态响应
type VoteStatusVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	HasVoted bool `json:"hasVoted"`
	UserRating string `json:"userRating"`
}
