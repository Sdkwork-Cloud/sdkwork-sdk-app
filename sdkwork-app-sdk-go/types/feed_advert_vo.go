package types

// 信息流广告VO
type FeedAdvertVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AdvertId string `json:"advertId"`
	AdvertName string `json:"advertName"`
	AdvertType string `json:"advertType"`
	PositionId string `json:"positionId"`
	CreativeUrl string `json:"creativeUrl"`
	LandingUrl string `json:"landingUrl"`
	Priority int `json:"priority"`
	Enabled bool `json:"enabled"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	ClickCount int `json:"clickCount"`
	ImpressionCount int `json:"impressionCount"`
	Title string `json:"title"`
	Description string `json:"description"`
	ImageUrl string `json:"imageUrl"`
	Likes int `json:"likes"`
	Comments int `json:"comments"`
}
