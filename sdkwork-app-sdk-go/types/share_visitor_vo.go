package types

// 分享访客响应
type ShareVisitorVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	VisitorId string `json:"visitorId"`
	VisitTime string `json:"visitTime"`
	UserAgent string `json:"userAgent"`
	IpAddress string `json:"ipAddress"`
	DeviceInfo string `json:"deviceInfo"`
	VisitType string `json:"visitType"`
}
