package types

// 密码修改请求
type PasswordChangeForm struct {
	OldPassword string `json:"oldPassword"`
	NewPassword string `json:"newPassword"`
	ConfirmPassword string `json:"confirmPassword"`
	VerifyCode string `json:"verifyCode"`
}
