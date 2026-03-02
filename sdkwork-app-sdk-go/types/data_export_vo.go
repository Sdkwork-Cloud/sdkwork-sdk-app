package types

// 数据导出响应
type DataExportVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	Status string `json:"status"`
	DownloadUrl string `json:"downloadUrl"`
	FileSize string `json:"fileSize"`
	EstimatedCompletionTime string `json:"estimatedCompletionTime"`
	Progress int `json:"progress"`
	ErrorMessage string `json:"errorMessage"`
}
