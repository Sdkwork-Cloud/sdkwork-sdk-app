package types

// 邀请链接响应
type InviteLinkVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	InviteLink string `json:"inviteLink"`
	InviteCode string `json:"inviteCode"`
	ExpireTime string `json:"expireTime"`
	QrCode string `json:"qrCode"`
}
