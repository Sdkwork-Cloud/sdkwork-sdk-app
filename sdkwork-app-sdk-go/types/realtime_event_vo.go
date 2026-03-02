package types

// 实时事件VO
type RealtimeEventVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	EventId string `json:"eventId"`
	EventName string `json:"eventName"`
	EventType string `json:"eventType"`
	UserId string `json:"userId"`
	DeviceId string `json:"deviceId"`
	Timestamp string `json:"timestamp"`
	PageUrl string `json:"pageUrl"`
	Referrer string `json:"referrer"`
}
