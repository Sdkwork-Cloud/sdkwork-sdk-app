package types

// 安全设置响应
type SecuritySettingsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TwoFactorEnabled bool `json:"twoFactorEnabled"`
	BiometricEnabled bool `json:"biometricEnabled"`
	AutoLockEnabled bool `json:"autoLockEnabled"`
	AutoLockMinutes int `json:"autoLockMinutes"`
	LoginNotificationsEnabled bool `json:"loginNotificationsEnabled"`
	IpRestrictionEnabled bool `json:"ipRestrictionEnabled"`
	AllowedIps []string `json:"allowedIps"`
	PasswordStrengthCheckEnabled bool `json:"passwordStrengthCheckEnabled"`
	PasswordExpiryDays int `json:"passwordExpiryDays"`
	LastPasswordChangeTime string `json:"lastPasswordChangeTime"`
}
