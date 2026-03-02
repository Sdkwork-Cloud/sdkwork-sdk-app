package types

// VIP套餐响应
type VipPackVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Price float64 `json:"price"`
	OriginalPrice float64 `json:"originalPrice"`
	PointAmount int `json:"pointAmount"`
	VipDurationDays int `json:"vipDurationDays"`
	LevelName string `json:"levelName"`
	SortWeight int `json:"sortWeight"`
	Recommended bool `json:"recommended"`
	Tags []string `json:"tags"`
}
