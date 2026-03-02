package types

// 上传策略响应
type UploadPolicyVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	BucketName string `json:"bucketName"`
	ObjectKeyPrefix string `json:"objectKeyPrefix"`
	ExpirationTime string `json:"expirationTime"`
	MaxFileSize int `json:"maxFileSize"`
	MinFileSize int `json:"minFileSize"`
	AllowedContentTypes []string `json:"allowedContentTypes"`
	AllowOverwrite bool `json:"allowOverwrite"`
	CallbackUrl string `json:"callbackUrl"`
}
