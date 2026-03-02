package types

// VIP邀请记录响应
type VipInviteRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	InviteeId int `json:"inviteeId"`
	InviteeNickname string `json:"inviteeNickname"`
	InviteeAvatar string `json:"inviteeAvatar"`
	Status string `json:"status"`
	RewardPoints int `json:"rewardPoints"`
	InvitedAt string `json:"invitedAt"`
	CompletedAt string `json:"completedAt"`
}
