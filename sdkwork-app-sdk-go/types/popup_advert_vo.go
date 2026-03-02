package types

// 弹窗广告VO
type PopupAdvertVO struct {
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
	PopupSize string `json:"popupSize"`
	DisplayDuration int `json:"displayDuration"`
	CloseButtonEnabled bool `json:"closeButtonEnabled"`
	PopupPosition string `json:"popupPosition"`
}
