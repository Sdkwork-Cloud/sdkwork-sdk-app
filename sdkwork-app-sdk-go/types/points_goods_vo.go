package types

// 积分商品
type PointsGoodsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Image string `json:"image"`
	Category string `json:"category"`
	Points int `json:"points"`
	OriginalPoints int `json:"originalPoints"`
	Stock int `json:"stock"`
	Exchangeable bool `json:"exchangeable"`
	LimitPerUser int `json:"limitPerUser"`
	ExchangedCount int `json:"exchangedCount"`
	Tags []string `json:"tags"`
	SortWeight int `json:"sortWeight"`
}
