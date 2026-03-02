package types

// 两步验证设置请求
type TwoFactorToggleForm struct {
	Enable bool `json:"enable"`
	Method string `json:"method"`
	VerificationCode string `json:"verificationCode"`
}
