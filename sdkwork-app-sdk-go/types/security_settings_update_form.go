package types

// 更新安全设置请求
type SecuritySettingsUpdateForm struct {
	TwoFactorEnabled bool `json:"twoFactorEnabled"`
	BiometricEnabled bool `json:"biometricEnabled"`
	AutoLockEnabled bool `json:"autoLockEnabled"`
	AutoLockMinutes int `json:"autoLockMinutes"`
	LoginNotificationsEnabled bool `json:"loginNotificationsEnabled"`
	IpRestrictionEnabled bool `json:"ipRestrictionEnabled"`
	AllowedIps []string `json:"allowedIps"`
	PasswordStrengthCheckEnabled bool `json:"passwordStrengthCheckEnabled"`
	PasswordExpiryDays int `json:"passwordExpiryDays"`
}
