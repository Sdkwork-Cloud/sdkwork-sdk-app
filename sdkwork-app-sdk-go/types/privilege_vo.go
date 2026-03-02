package types

// 等级特权
type PrivilegeVO struct {
	PrivilegeId string `json:"privilegeId"`
	Name string `json:"name"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Type string `json:"type"`
	Status string `json:"status"`
}
