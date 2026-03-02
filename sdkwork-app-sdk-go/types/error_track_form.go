package types

// 错误追踪请求
type ErrorTrackForm struct {
	ErrorType string `json:"errorType"`
	ErrorMessage string `json:"errorMessage"`
	StackTrace string `json:"stackTrace"`
	DeviceId string `json:"deviceId"`
	UserId string `json:"userId"`
	AppVersion string `json:"appVersion"`
	DeviceModel string `json:"deviceModel"`
	OsVersion string `json:"osVersion"`
	Context string `json:"context"`
	ErrorTime string `json:"errorTime"`
}
