package types

// 邀请奖励领取响应
type InviteRewardClaimVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	Amount string `json:"amount"`
	Balance string `json:"balance"`
	TransactionId string `json:"transactionId"`
}
