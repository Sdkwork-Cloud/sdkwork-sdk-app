package types

// 广告点击请求
type AdvertClickForm struct {
	AdvertId string `json:"advertId"`
	PositionId string `json:"positionId"`
	ClickTime string `json:"clickTime"`
	DeviceId string `json:"deviceId"`
	IpAddress string `json:"ipAddress"`
	UserAgent string `json:"userAgent"`
}
