package types

// 下载链接响应
type DownloadUrlVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Resource AssetMediaResource `json:"resource"`
	ExpiresIn int `json:"expiresIn"`
}
