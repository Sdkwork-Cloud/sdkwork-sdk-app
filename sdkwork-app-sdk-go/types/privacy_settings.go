package types

// 隐私设置
type PrivacySettings struct {
	PublicProfile bool `json:"publicProfile"`
	AllowSearch bool `json:"allowSearch"`
	AllowFriendRequest bool `json:"allowFriendRequest"`
	AllowStrangerMessage bool `json:"allowStrangerMessage"`
	LocationShare bool `json:"locationShare"`
}
