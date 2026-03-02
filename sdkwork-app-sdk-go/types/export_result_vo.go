package types

// 导出结果VO
type ExportResultVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ExportId string `json:"exportId"`
	ReportType string `json:"reportType"`
	Status string `json:"status"`
	DownloadUrl string `json:"downloadUrl"`
	FileSize int `json:"fileSize"`
	CompletedAt string `json:"completedAt"`
	ErrorMessage string `json:"errorMessage"`
}
