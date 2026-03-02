package types

// VIP邀请响应
type VipInviteVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	InviteId string `json:"inviteId"`
	Email string `json:"email"`
	Phone string `json:"phone"`
	Status string `json:"status"`
}
