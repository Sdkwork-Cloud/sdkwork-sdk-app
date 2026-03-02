package types

// 发送验证码请求
type VerifyCodeSendForm struct {
	Target string `json:"target"`
	Type string `json:"type"`
	VerifyType string `json:"verifyType"`
	DeviceId string `json:"deviceId"`
}
