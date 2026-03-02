package types

// 排名信息
type RankInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Rank int `json:"rank"`
	UserId string `json:"userId"`
	Username string `json:"username"`
	Score int `json:"score"`
	Avatar string `json:"avatar"`
	IsCurrentUser bool `json:"isCurrentUser"`
}
