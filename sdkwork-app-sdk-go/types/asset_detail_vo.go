package types

// 资产详情响应
type AssetDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AssetId string `json:"assetId"`
	AssetName string `json:"assetName"`
	AssetType string `json:"assetType"`
	FileType string `json:"fileType"`
	FileTypeName string `json:"fileTypeName"`
	MimeType string `json:"mimeType"`
	Size int `json:"size"`
	Description string `json:"description"`
	Tags []string `json:"tags"`
	FolderId string `json:"folderId"`
	Status string `json:"status"`
	StatusName string `json:"statusName"`
	CoverImage ImageMediaResource `json:"coverImage"`
	Assets []AssetMediaResource `json:"assets"`
	PrimaryUrl string `json:"primaryUrl"`
	ThumbnailUrl string `json:"thumbnailUrl"`
	DiskId string `json:"diskId"`
	Path string `json:"path"`
	VersionId string `json:"versionId"`
	DownloadCount int `json:"downloadCount"`
	Favorited bool `json:"favorited"`
	Author string `json:"author"`
	Extension string `json:"extension"`
}
