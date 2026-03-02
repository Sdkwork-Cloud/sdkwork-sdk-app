package types

// 推荐内容响应
type RecommendationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Type string `json:"type"`
	Title string `json:"title"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Image string `json:"image"`
	Url string `json:"url"`
	Rating float64 `json:"rating"`
	HotScore int `json:"hotScore"`
	Reason string `json:"reason"`
	Scenarios []string `json:"scenarios"`
	Tags []string `json:"tags"`
	IsFree bool `json:"isFree"`
	Price string `json:"price"`
	Priority int `json:"priority"`
}
