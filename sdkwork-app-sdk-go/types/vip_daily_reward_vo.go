package types

// VIP每日奖励响应
type VipDailyRewardVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RewardPoints int `json:"rewardPoints"`
	ClaimedAt string `json:"claimedAt"`
	Message string `json:"message"`
	ConsecutiveDays int `json:"consecutiveDays"`
}
