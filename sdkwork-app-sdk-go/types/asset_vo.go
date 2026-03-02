package types

// 资产响应
type AssetVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AssetId string `json:"assetId"`
	AssetName string `json:"assetName"`
	AssetType string `json:"assetType"`
	FileType string `json:"fileType"`
	MimeType string `json:"mimeType"`
	Size int `json:"size"`
	Description string `json:"description"`
	Tags []string `json:"tags"`
	FolderId string `json:"folderId"`
	Status string `json:"status"`
	CoverImage ImageMediaResource `json:"coverImage"`
	Assets []AssetMediaResource `json:"assets"`
	PrimaryUrl string `json:"primaryUrl"`
	ThumbnailUrl string `json:"thumbnailUrl"`
}
