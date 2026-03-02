package types

// 广告位VO
type AdvertPositionVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PositionId string `json:"positionId"`
	PositionName string `json:"positionName"`
	PositionType string `json:"positionType"`
	Description string `json:"description"`
	Priority int `json:"priority"`
	Enabled bool `json:"enabled"`
	AdvertCount int `json:"advertCount"`
}
