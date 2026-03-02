package types

// 生成邀请链接请求
type InviteLinkForm struct {
	InviteType string `json:"inviteType"`
	ExpireSeconds int `json:"expireSeconds"`
	InviteCode string `json:"inviteCode"`
	Channel string `json:"channel"`
}
