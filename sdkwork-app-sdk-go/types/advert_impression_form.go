package types

// 广告展示请求
type AdvertImpressionForm struct {
	AdvertId string `json:"advertId"`
	PositionId string `json:"positionId"`
	ImpressionTime string `json:"impressionTime"`
	DeviceId string `json:"deviceId"`
	IpAddress string `json:"ipAddress"`
	UserAgent string `json:"userAgent"`
	ScreenSize string `json:"screenSize"`
}
