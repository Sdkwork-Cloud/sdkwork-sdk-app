package types

// VIP每日奖励状态响应
type VipDailyRewardStatusVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	CanClaim bool `json:"canClaim"`
	ClaimedToday bool `json:"claimedToday"`
	ConsecutiveDays int `json:"consecutiveDays"`
	TotalDays int `json:"totalDays"`
}
