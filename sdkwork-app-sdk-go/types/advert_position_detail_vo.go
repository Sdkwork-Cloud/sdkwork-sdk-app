package types

// 广告位详情VO
type AdvertPositionDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PositionId string `json:"positionId"`
	PositionName string `json:"positionName"`
	PositionType string `json:"positionType"`
	Description string `json:"description"`
	Priority int `json:"priority"`
	Enabled bool `json:"enabled"`
	Adverts []AdvertVO `json:"adverts"`
}
