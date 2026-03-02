package types

// 热门搜索响应
type HotSearchVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Keyword string `json:"keyword"`
	Count int `json:"count"`
	Rank int `json:"rank"`
}
