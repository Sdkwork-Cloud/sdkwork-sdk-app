package types

// 上传初始化响应
type UploadInitVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UploadId string `json:"uploadId"`
	FileName string `json:"fileName"`
	FileSize int `json:"fileSize"`
	ChunkSize int `json:"chunkSize"`
	TotalChunks int `json:"totalChunks"`
	StoragePath string `json:"storagePath"`
	UploadUrl string `json:"uploadUrl"`
	UploadParams interface{} `json:"uploadParams"`
	UploadedChunks []int `json:"uploadedChunks"`
	ExpireTime int `json:"expireTime"`
	SupportResume bool `json:"supportResume"`
	UploadType string `json:"uploadType"`
}
