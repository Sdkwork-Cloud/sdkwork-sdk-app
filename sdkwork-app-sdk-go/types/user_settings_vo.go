package types

// 用户设置响应
type UserSettingsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Theme string `json:"theme"`
	Language string `json:"language"`
	NotificationSettings NotificationSettingsVO `json:"notificationSettings"`
	PrivacySettings PrivacySettingsVO `json:"privacySettings"`
}
