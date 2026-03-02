package types

// 分享访问请求
type ShareVisitForm struct {
	ShareId string `json:"shareId"`
	VisitType string `json:"visitType"`
	UserAgent string `json:"userAgent"`
	IpAddress string `json:"ipAddress"`
	DeviceInfo string `json:"deviceInfo"`
}
