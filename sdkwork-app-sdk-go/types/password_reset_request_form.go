package types

// 重置密码挑战请求
type PasswordResetRequestForm struct {
	Account string `json:"account"`
	Channel string `json:"channel"`
	DeviceId string `json:"deviceId"`
	Locale string `json:"locale"`
	RedirectUri string `json:"redirectUri"`
}
