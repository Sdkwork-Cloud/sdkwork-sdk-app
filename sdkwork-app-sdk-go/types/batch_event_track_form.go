package types

// 批量事件追踪请求
type BatchEventTrackForm struct {
	Events []EventTrackForm `json:"events"`
	DeviceId string `json:"deviceId"`
	UserId string `json:"userId"`
	SubmitTime string `json:"submitTime"`
}
