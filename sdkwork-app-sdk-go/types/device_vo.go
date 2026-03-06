package types

// 设备响应
type DeviceVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	DeviceId string `json:"deviceId"`
	Type string `json:"type"`
	DeviceType string `json:"deviceType"`
	Name string `json:"name"`
	DeviceName string `json:"deviceName"`
	PushToken string `json:"pushToken"`
	Description string `json:"description"`
	Status string `json:"status"`
	IpAddress string `json:"ipAddress"`
	MacAddress string `json:"macAddress"`
	Metadata map[string]interface{} `json:"metadata"`
	UserId string `json:"userId"`
	OsVersion string `json:"osVersion"`
	AppVersion string `json:"appVersion"`
	IsActive bool `json:"isActive"`
	RegisterTime string `json:"registerTime"`
	LastActiveAt string `json:"lastActiveAt"`
}
