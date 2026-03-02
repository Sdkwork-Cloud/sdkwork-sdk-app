package types

// 发布检查响应
type RolloutCheckVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RolloutKey string `json:"rolloutKey"`
	CanRollout bool `json:"canRollout"`
	Reason string `json:"reason"`
	Status string `json:"status"`
	CheckedAt string `json:"checkedAt"`
}
