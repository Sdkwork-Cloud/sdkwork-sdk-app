package types

// 隐私设置
type PrivacySettingsVO struct {
	PublicProfile bool `json:"publicProfile"`
	AllowSearch bool `json:"allowSearch"`
	AllowFriendRequest bool `json:"allowFriendRequest"`
}
