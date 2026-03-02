package types


type InviteRulesVO struct {
	Title string `json:"title"`
	Description string `json:"description"`
	InviterReward int `json:"inviterReward"`
	InviteeReward int `json:"inviteeReward"`
	Rules []string `json:"rules"`
}
