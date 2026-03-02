package types

// 热门项目响应
type TrendingItemVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Cover string `json:"cover"`
	Type string `json:"type"`
	Url string `json:"url"`
	HotScore int `json:"hotScore"`
	Rating float64 `json:"rating"`
	Downloads int `json:"downloads"`
	Favorites int `json:"favorites"`
	Comments int `json:"comments"`
	Author string `json:"author"`
	Tags []string `json:"tags"`
	Price string `json:"price"`
	IsFree bool `json:"isFree"`
	UpdateTime string `json:"updateTime"`
}
