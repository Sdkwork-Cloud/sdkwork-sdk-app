package types

// 用户设置更新请求
type UserSettingsUpdateForm struct {
	NotificationSettings NotificationSettings `json:"notificationSettings"`
	PrivacySettings PrivacySettings `json:"privacySettings"`
	Language string `json:"language"`
	Theme string `json:"theme"`
	AutoPlay bool `json:"autoPlay"`
	HighQuality bool `json:"highQuality"`
	DataSaver bool `json:"dataSaver"`
	DownloadSettings DownloadSettings `json:"downloadSettings"`
}
