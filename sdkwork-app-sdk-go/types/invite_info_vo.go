package types

// 邀请信息响应
type InviteInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	InviteCode string `json:"inviteCode"`
	InviteLink string `json:"inviteLink"`
	InviteCount int `json:"inviteCount"`
	RewardAmount string `json:"rewardAmount"`
	RemainingReward string `json:"remainingReward"`
}
