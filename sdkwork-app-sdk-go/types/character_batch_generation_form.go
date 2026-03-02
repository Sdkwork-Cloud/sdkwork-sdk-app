package types

// 批量角色生成请求
type CharacterBatchGenerationForm struct {
	Characters []CharacterItem `json:"characters"`
	Model string `json:"model"`
}
