package types

// Banner广告VO
type BannerAdvertVO struct {
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
	BannerSize string `json:"bannerSize"`
	AnimationType string `json:"animationType"`
	RefreshInterval int `json:"refreshInterval"`
}
