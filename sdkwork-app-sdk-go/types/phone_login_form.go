package types

// 手机号验证码登录请求
type PhoneLoginForm struct {
	Phone string `json:"phone"`
	Code string `json:"code"`
	DeviceId string `json:"deviceId"`
	DeviceType string `json:"deviceType"`
	DeviceName string `json:"deviceName"`
	AppVersion string `json:"appVersion"`
}
