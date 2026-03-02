package types

// 两步验证设置响应
type TwoFactorSetupVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Enabled bool `json:"enabled"`
	Method string `json:"method"`
	QrCodeData string `json:"qrCodeData"`
	SecretKey string `json:"secretKey"`
	VerificationCode string `json:"verificationCode"`
	RecoveryCodes []string `json:"recoveryCodes"`
}
