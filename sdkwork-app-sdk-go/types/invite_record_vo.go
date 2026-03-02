package types

// 邀请记录响应
type InviteRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	InviteeId string `json:"inviteeId"`
	InviteeNickname string `json:"inviteeNickname"`
	InviteTime string `json:"inviteTime"`
	Status string `json:"status"`
	RewardAmount string `json:"rewardAmount"`
}
