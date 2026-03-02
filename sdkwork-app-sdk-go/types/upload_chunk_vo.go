package types

// 上传分块响应
type UploadChunkVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UploadId string `json:"uploadId"`
	ChunkIndex int `json:"chunkIndex"`
	ChunkSize int `json:"chunkSize"`
	Status string `json:"status"`
	Success bool `json:"success"`
	ErrorMsg string `json:"errorMsg"`
	ChunkMd5 string `json:"chunkMd5"`
	UploadedSize int `json:"uploadedSize"`
	RemainingChunks int `json:"remainingChunks"`
	Progress int `json:"progress"`
}
