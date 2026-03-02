package types

// VIP特权
type VipPrivilegeVO struct {
	Id string `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Status string `json:"status"`
	Type string `json:"type"`
}
