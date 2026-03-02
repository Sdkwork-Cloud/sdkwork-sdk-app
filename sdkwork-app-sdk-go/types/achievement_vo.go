package types

// 成就响应
type AchievementVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Level string `json:"level"`
	Status string `json:"status"`
	UnlockedAt string `json:"unlockedAt"`
	Progress int `json:"progress"`
	Target int `json:"target"`
	Type string `json:"type"`
	Points int `json:"points"`
	Sort int `json:"sort"`
}
