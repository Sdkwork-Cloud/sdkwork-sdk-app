package types

// 预签名URL响应
type PresignedUrlVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Url string `json:"url"`
	PreviewUrl string `json:"previewUrl"`
	ObjectKey string `json:"objectKey"`
}
