package types

// 更新角色表单
type CharacterUpdateForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Personality string `json:"personality"`
	Background string `json:"background"`
}
