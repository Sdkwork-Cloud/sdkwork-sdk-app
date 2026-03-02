package types

// 验证分享请求
type ShareVerifyForm struct {
	ShareId string `json:"shareId"`
	Password string `json:"password"`
	VerificationCode string `json:"verificationCode"`
}
