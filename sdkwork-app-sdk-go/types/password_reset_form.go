package types

// 重置密码请求
type PasswordResetForm struct {
	Account string `json:"account"`
	Code string `json:"code"`
	NewPassword string `json:"newPassword"`
	ConfirmPassword string `json:"confirmPassword"`
}
