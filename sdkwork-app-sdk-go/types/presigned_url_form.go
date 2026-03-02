package types

// 预签名URL请求
type PresignedUrlForm struct {
	ObjectKey string `json:"objectKey"`
	Bucket string `json:"bucket"`
	Method string `json:"method"`
	ExpirationSeconds int `json:"expirationSeconds"`
}
