package types

// 视频完成请求
type VideoCompleteForm struct {
	AdvertId string `json:"advertId"`
	VideoId string `json:"videoId"`
	CompleteTime string `json:"completeTime"`
	Duration string `json:"duration"`
	DeviceId string `json:"deviceId"`
	IpAddress string `json:"ipAddress"`
}
