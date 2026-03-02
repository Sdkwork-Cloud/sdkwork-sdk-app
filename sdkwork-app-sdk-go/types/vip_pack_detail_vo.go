package types

// VIP套餐详情响应
type VipPackDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Price float64 `json:"price"`
	OriginalPrice float64 `json:"originalPrice"`
	PointAmount int `json:"pointAmount"`
	VipDurationDays int `json:"vipDurationDays"`
	LevelId int `json:"levelId"`
	LevelName string `json:"levelName"`
	GroupId int `json:"groupId"`
	GroupName string `json:"groupName"`
	ValidFrom string `json:"validFrom"`
	ValidTo string `json:"validTo"`
	SortWeight int `json:"sortWeight"`
	Benefits []VipBenefitVO `json:"benefits"`
}
