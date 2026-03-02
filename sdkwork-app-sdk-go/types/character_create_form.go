package types

// 创建角色表单
type CharacterCreateForm struct {
	Name string `json:"name"`
	Type string `json:"type"`
	Description string `json:"description"`
	AgentId int `json:"agentId"`
}
