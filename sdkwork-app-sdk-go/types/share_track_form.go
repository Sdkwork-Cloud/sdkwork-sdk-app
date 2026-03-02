package types

// 分享追踪请求
type ShareTrackForm struct {
	ShareId string `json:"shareId"`
	TrackType string `json:"trackType"`
	UserAgent string `json:"userAgent"`
	IpAddress string `json:"ipAddress"`
	DeviceInfo string `json:"deviceInfo"`
}
