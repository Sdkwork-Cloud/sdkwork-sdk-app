package types

// 奖品领取结果
type PrizeClaimVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	PrizeName string `json:"prizeName"`
	PrizeType string `json:"prizeType"`
	ClaimTime string `json:"claimTime"`
	RewardDetails map[string]interface{} `json:"rewardDetails"`
	Message string `json:"message"`
}
