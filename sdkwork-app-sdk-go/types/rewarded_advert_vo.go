package types

// 奖励广告VO
type RewardedAdvertVO struct {
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
	RewardType string `json:"rewardType"`
	RewardAmount int `json:"rewardAmount"`
	VideoDuration int `json:"videoDuration"`
	SkipEnabled bool `json:"skipEnabled"`
	RewardMessage string `json:"rewardMessage"`
}
