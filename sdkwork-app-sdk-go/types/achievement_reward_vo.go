package types

// 成就奖励响应
type AchievementRewardVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Name string `json:"name"`
	Type string `json:"type"`
	Amount int `json:"amount"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Status string `json:"status"`
	ClaimedAt string `json:"claimedAt"`
}
