package types

// 导出响应
type ExportVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TaskId string `json:"taskId"`
	FileUrl string `json:"fileUrl"`
	FileName string `json:"fileName"`
	FileSize int `json:"fileSize"`
	Status string `json:"status"`
	Format string `json:"format"`
	ExportCount int `json:"exportCount"`
	ExpireTime string `json:"expireTime"`
}
