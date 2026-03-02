package types

// 事件趋势VO
type EventTrendVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	EventName string `json:"eventName"`
	TimePoints []string `json:"timePoints"`
	Values []int `json:"values"`
	TotalCount int `json:"totalCount"`
	GrowthRate float64 `json:"growthRate"`
	Interval string `json:"interval"`
}
