package types

// 事件追踪请求
type EventTrackForm struct {
	EventName string `json:"eventName"`
	EventType string `json:"eventType"`
	Timestamp string `json:"timestamp"`
	DeviceId string `json:"deviceId"`
	UserId string `json:"userId"`
	Properties map[string]interface{} `json:"properties"`
	SessionId string `json:"sessionId"`
	PageUrl string `json:"pageUrl"`
	Referrer string `json:"referrer"`
}
