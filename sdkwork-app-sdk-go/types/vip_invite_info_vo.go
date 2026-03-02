package types

// VIP邀请信息响应
type VipInviteInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	InviteCode string `json:"inviteCode"`
	InviteLink string `json:"inviteLink"`
	TotalInvites int `json:"totalInvites"`
	SuccessfulInvites int `json:"successfulInvites"`
	RewardPoints int `json:"rewardPoints"`
	RewardRule string `json:"rewardRule"`
}
