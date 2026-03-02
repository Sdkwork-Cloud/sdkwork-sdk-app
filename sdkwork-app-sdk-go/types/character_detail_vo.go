package types

// 角色详情响应
type CharacterDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CharacterId string `json:"characterId"`
	Name string `json:"name"`
	Type string `json:"type"`
	Description string `json:"description"`
	Avatar ImageMediaResource `json:"avatar"`
	ThreeViewImage ImageMediaResource `json:"threeViewImage"`
	GridShotsImage ImageMediaResource `json:"gridShotsImage"`
	AvatarVideo VideoMediaResource `json:"avatarVideo"`
	Status string `json:"status"`
	AgentId int `json:"agentId"`
	Personality string `json:"personality"`
	Background string `json:"background"`
	InteractionSettings string `json:"interactionSettings"`
	Version string `json:"version"`
	IsPublic bool `json:"isPublic"`
	UsageCount int `json:"usageCount"`
	LikeCount int `json:"likeCount"`
	LastUsedAt string `json:"lastUsedAt"`
}
