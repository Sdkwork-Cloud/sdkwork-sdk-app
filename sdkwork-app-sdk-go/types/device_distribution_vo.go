package types

// 设备分布VO
type DeviceDistributionVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	DeviceType string `json:"deviceType"`
	DeviceModel string `json:"deviceModel"`
	OsType string `json:"osType"`
	OsVersion string `json:"osVersion"`
	UserCount int `json:"userCount"`
	Percentage float64 `json:"percentage"`
	ActiveCount int `json:"activeCount"`
}
