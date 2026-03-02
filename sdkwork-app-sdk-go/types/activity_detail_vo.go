package types

// 活动详情
type ActivityDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Title string `json:"title"`
	Description string `json:"description"`
	Type string `json:"type"`
	CoverImage string `json:"coverImage"`
	BannerImages []string `json:"bannerImages"`
	Rules string `json:"rules"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	ParticipantCount int `json:"participantCount"`
	HasJoined bool `json:"hasJoined"`
	MaxJoinCount int `json:"maxJoinCount"`
	JoinedCount int `json:"joinedCount"`
	RemainingCount int `json:"remainingCount"`
	Rewards []ActivityReward `json:"rewards"`
	ExtraConfig map[string]interface{} `json:"extraConfig"`
}
