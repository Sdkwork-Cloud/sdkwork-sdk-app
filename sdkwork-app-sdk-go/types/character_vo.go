package types

// 角色响应
type CharacterVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CharacterId string `json:"characterId"`
	Name string `json:"name"`
	Type string `json:"type"`
	Description string `json:"description"`
	Avatar ImageMediaResource `json:"avatar"`
	Status string `json:"status"`
	AgentId int `json:"agentId"`
	IsPublic bool `json:"isPublic"`
	UsageCount int `json:"usageCount"`
	LikeCount int `json:"likeCount"`
}
