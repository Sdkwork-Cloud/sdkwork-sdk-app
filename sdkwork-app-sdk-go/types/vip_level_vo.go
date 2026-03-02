package types

// VIP等级响应
type VipLevelVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	LevelValue int `json:"levelValue"`
	RequiredPoints int `json:"requiredPoints"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Badge string `json:"badge"`
}
