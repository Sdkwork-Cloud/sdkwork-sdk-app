package types

// 页面访问追踪请求
type PageViewTrackForm struct {
	PageUrl string `json:"pageUrl"`
	PageTitle string `json:"pageTitle"`
	Referrer string `json:"referrer"`
	Timestamp string `json:"timestamp"`
	DeviceId string `json:"deviceId"`
	UserId string `json:"userId"`
	Properties map[string]interface{} `json:"properties"`
	SessionId string `json:"sessionId"`
	Duration int `json:"duration"`
}
