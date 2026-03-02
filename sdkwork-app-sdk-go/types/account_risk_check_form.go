package types

// 账号风险检测请求
type AccountRiskCheckForm struct {
	UserId string `json:"userId"`
	DeviceId string `json:"deviceId"`
	IpAddress string `json:"ipAddress"`
	Scene string `json:"scene"`
	Location string `json:"location"`
}
