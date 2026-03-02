package types

// 广告举报请求
type AdvertReportForm struct {
	AdvertId string `json:"advertId"`
	ReportType string `json:"reportType"`
	Reason string `json:"reason"`
	ScreenshotUrl string `json:"screenshotUrl"`
	DeviceId string `json:"deviceId"`
	IpAddress string `json:"ipAddress"`
}
