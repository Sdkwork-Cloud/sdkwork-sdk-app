package types

// 上传初始化请求
type UploadInitForm struct {
	FileName string `json:"fileName"`
	FileSize int `json:"fileSize"`
	FileMd5 string `json:"fileMd5"`
	FileType string `json:"fileType"`
	UploadType string `json:"uploadType"`
	ChunkSize int `json:"chunkSize"`
	TotalChunks int `json:"totalChunks"`
	StoragePath string `json:"storagePath"`
	BusinessType string `json:"businessType"`
	BusinessId string `json:"businessId"`
}
