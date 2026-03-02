package types

// 用户等级响应
type UserLevelVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Icon string `json:"icon"`
	Description string `json:"description"`
	Level int `json:"level"`
	CurrentExp int `json:"currentExp"`
	RequiredExp int `json:"requiredExp"`
	ExpProgress float64 `json:"expProgress"`
	Privileges []PrivilegeVO `json:"privileges"`
	ValidUntil string `json:"validUntil"`
	Status string `json:"status"`
}
