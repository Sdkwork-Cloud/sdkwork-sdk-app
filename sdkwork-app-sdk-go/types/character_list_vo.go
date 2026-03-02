package types

// 角色列表响应
type CharacterListVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Characters []CharacterItem `json:"characters"`
	Total int `json:"total"`
	Page int `json:"page"`
	Size int `json:"size"`
}
