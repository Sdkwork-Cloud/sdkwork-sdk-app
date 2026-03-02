package types

// 文件信息响应
type FileVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	FileId string `json:"fileId"`
	FileName string `json:"fileName"`
	FileSize int `json:"fileSize"`
	FileType string `json:"fileType"`
	Extension string `json:"extension"`
	ObjectKey string `json:"objectKey"`
	Path string `json:"path"`
	DiskId string `json:"diskId"`
	Status string `json:"status"`
	UploadStatus string `json:"uploadStatus"`
	ContentType string `json:"contentType"`
	FileCategory string `json:"fileCategory"`
	AssetType string `json:"assetType"`
	AccessUrl string `json:"accessUrl"`
	UploadTime string `json:"uploadTime"`
}
