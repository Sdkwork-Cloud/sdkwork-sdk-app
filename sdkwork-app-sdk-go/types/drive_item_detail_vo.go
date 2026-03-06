package types

// Drive item detail
type DriveItemDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ItemId string `json:"itemId"`
	ItemUuid string `json:"itemUuid"`
	ItemName string `json:"itemName"`
	FileType string `json:"fileType"`
	Directory bool `json:"directory"`
	AssetType string `json:"assetType"`
	MimeType string `json:"mimeType"`
	Extension string `json:"extension"`
	Size int `json:"size"`
	ParentId string `json:"parentId"`
	Path string `json:"path"`
	ObjectKey string `json:"objectKey"`
	Status string `json:"status"`
	Favorited bool `json:"favorited"`
	Resource FileMediaResource `json:"resource"`
	CoverImage ImageMediaResource `json:"coverImage"`
	DiskId string `json:"diskId"`
	UploadStatus string `json:"uploadStatus"`
	Description string `json:"description"`
	Author string `json:"author"`
	VersionId string `json:"versionId"`
	ReferenceFileId string `json:"referenceFileId"`
	WorkspaceId string `json:"workspaceId"`
	ProjectId string `json:"projectId"`
	Etag string `json:"etag"`
}
