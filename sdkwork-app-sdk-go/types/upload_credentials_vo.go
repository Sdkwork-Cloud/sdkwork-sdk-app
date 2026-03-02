package types

// 上传凭证响应
type UploadCredentialsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AccessKeyId string `json:"accessKeyId"`
	SecretAccessKey string `json:"secretAccessKey"`
	SessionToken string `json:"sessionToken"`
	ExpirationTime string `json:"expirationTime"`
	Bucket string `json:"bucket"`
	Region string `json:"region"`
}
