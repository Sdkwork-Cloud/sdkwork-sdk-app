package types

// VIP套餐分组响应
type VipPackGroupVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	SortWeight int `json:"sortWeight"`
	Packs []VipPackVO `json:"packs"`
}
