package types

// 广告关闭请求
type AdvertCloseForm struct {
	AdvertId string `json:"advertId"`
	PositionId string `json:"positionId"`
	CloseTime string `json:"closeTime"`
	Duration string `json:"duration"`
	DeviceId string `json:"deviceId"`
	IpAddress string `json:"ipAddress"`
}
