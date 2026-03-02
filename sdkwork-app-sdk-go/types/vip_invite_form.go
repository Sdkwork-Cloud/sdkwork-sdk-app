package types

// VIP邀请请求
type VipInviteForm struct {
	Email string `json:"email"`
	Phone string `json:"phone"`
	Channel string `json:"channel"`
}
