package types

// 风格统计响应
type StyleStatisticsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TotalStyles int `json:"totalStyles"`
	ActiveStyles int `json:"activeStyles"`
	ImageStyles int `json:"imageStyles"`
	VideoStyles int `json:"videoStyles"`
	MusicStyles int `json:"musicStyles"`
}
