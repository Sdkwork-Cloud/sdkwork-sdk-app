package types

// 活动信息
type ActivityVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Title string `json:"title"`
	Subtitle string `json:"subtitle"`
	Type string `json:"type"`
	CoverImage string `json:"coverImage"`
	Status string `json:"status"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	HasJoined bool `json:"hasJoined"`
	MaxJoinCount int `json:"maxJoinCount"`
	JoinedCount int `json:"joinedCount"`
	Tags []string `json:"tags"`
}
