package types

// 系统状态VO
type SystemStatusVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Status string `json:"status"`
	Message string `json:"message"`
	Timestamp string `json:"timestamp"`
	Version string `json:"version"`
	Services ServiceStatus `json:"services"`
}
