package types

// 角色生成响应
type CharacterGenerationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	CharacterId string `json:"characterId"`
	Name string `json:"name"`
	Description string `json:"description"`
	ImageUrl string `json:"imageUrl"`
	ThumbnailUrl string `json:"thumbnailUrl"`
	Style string `json:"style"`
	Status string `json:"status"`
	CompletedAt string `json:"completedAt"`
}
