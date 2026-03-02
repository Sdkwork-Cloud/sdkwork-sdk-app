package types

// 设备注册表单
type DeviceRegisterForm struct {
	DeviceType string `json:"deviceType"`
	DeviceId string `json:"deviceId"`
	PushToken string `json:"pushToken"`
	OsVersion string `json:"osVersion"`
	AppVersion string `json:"appVersion"`
}
