package types

// 设备响应
type DeviceVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	DeviceId string `json:"deviceId"`
	DeviceType string `json:"deviceType"`
	DeviceName string `json:"deviceName"`
	PushToken string `json:"pushToken"`
	OsVersion string `json:"osVersion"`
	AppVersion string `json:"appVersion"`
	IsActive bool `json:"isActive"`
	RegisterTime string `json:"registerTime"`
	LastActiveAt string `json:"lastActiveAt"`
}
