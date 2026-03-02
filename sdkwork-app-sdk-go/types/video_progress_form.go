package types

// 视频进度请求
type VideoProgressForm struct {
	AdvertId string `json:"advertId"`
	VideoId string `json:"videoId"`
	Progress int `json:"progress"`
	Timestamp string `json:"timestamp"`
	DeviceId string `json:"deviceId"`
	IpAddress string `json:"ipAddress"`
}
