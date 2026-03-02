package types

// 开屏广告VO
type SplashAdvertVO struct {
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
	DisplayDuration int `json:"displayDuration"`
	SkipEnabled bool `json:"skipEnabled"`
	SkipDelay int `json:"skipDelay"`
	BackgroundColor string `json:"backgroundColor"`
	LogoUrl string `json:"logoUrl"`
}
