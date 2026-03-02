package types

// 活动参与请求
type ActivityJoinForm struct {
	ExtraParams map[string]interface{} `json:"extraParams"`
	InviteCode string `json:"inviteCode"`
}
