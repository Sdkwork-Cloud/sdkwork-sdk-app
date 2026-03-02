package types

// 排行榜
type RankingVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RankingType string `json:"rankingType"`
	Period string `json:"period"`
	Rankings []RankInfoVO `json:"rankings"`
	MyRank RankInfoVO `json:"myRank"`
	TotalUsers int `json:"totalUsers"`
}
