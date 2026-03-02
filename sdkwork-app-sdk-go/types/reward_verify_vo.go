package types

// 奖励验证VO
type RewardVerifyVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Verified bool `json:"verified"`
	RewardId string `json:"rewardId"`
	RewardType string `json:"rewardType"`
	RewardAmount int `json:"rewardAmount"`
	Message string `json:"message"`
	VerificationToken string `json:"verificationToken"`
}
