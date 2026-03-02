package types

// 投票统计响应
type VoteStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalVotes int `json:"totalVotes"`
	Likes int `json:"likes"`
	Dislikes int `json:"dislikes"`
	Neutrals int `json:"neutrals"`
	LikeRatio string `json:"likeRatio"`
}
