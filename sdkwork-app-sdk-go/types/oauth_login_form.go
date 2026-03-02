package types

// OAuth登录请求
type OAuthLoginForm struct {
	Provider string `json:"provider"`
	Code string `json:"code"`
	State string `json:"state"`
	DeviceId string `json:"deviceId"`
	DeviceType string `json:"deviceType"`
}
