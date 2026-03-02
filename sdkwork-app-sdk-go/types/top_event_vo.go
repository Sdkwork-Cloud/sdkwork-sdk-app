package types

// 热门事件VO
type TopEventVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	EventName string `json:"eventName"`
	Count int `json:"count"`
	Percentage float64 `json:"percentage"`
	EventType string `json:"eventType"`
}
