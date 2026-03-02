package types

// 应用配置响应
type AppConfigVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Version string `json:"version"`
	BuildNumber string `json:"buildNumber"`
	ApiVersion string `json:"apiVersion"`
	ServerTime int `json:"serverTime"`
	Features map[string]bool `json:"features"`
	SystemConfig map[string]interface{} `json:"systemConfig"`
	MaintenanceMode bool `json:"maintenanceMode"`
	MaintenanceMessage string `json:"maintenanceMessage"`
}
