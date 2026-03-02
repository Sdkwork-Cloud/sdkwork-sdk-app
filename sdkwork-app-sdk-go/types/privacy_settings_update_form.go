package types

// 更新隐私设置请求
type PrivacySettingsUpdateForm struct {
	DataCollectionEnabled bool `json:"dataCollectionEnabled"`
	PersonalizedRecommendationsEnabled bool `json:"personalizedRecommendationsEnabled"`
	ThirdPartyAnalyticsEnabled bool `json:"thirdPartyAnalyticsEnabled"`
	NotificationsEnabled bool `json:"notificationsEnabled"`
	UsageDataSharingEnabled bool `json:"usageDataSharingEnabled"`
	AutoSaveEnabled bool `json:"autoSaveEnabled"`
	DataRetentionDays int `json:"dataRetentionDays"`
	AiLearningEnabled bool `json:"aiLearningEnabled"`
}
