package types

// VIP套餐分组查询请求
type VipPackGroupQueryForm struct {
	VipLevelId int `json:"vipLevelId"`
	RecommendedOnly bool `json:"recommendedOnly"`
}
