package types

// Filesystem node object
type FileSystemNodeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	NodeId string `json:"nodeId"`
	NodeUuid string `json:"nodeUuid"`
	Name string `json:"name"`
	Type string `json:"type"`
	Directory bool `json:"directory"`
	DiskId string `json:"diskId"`
	ParentId string `json:"parentId"`
	Path string `json:"path"`
	RelativePath string `json:"relativePath"`
	ObjectKey string `json:"objectKey"`
	Size int `json:"size"`
	MimeType string `json:"mimeType"`
	Extension string `json:"extension"`
	AssetType string `json:"assetType"`
	Status string `json:"status"`
	Description string `json:"description"`
	Tags []string `json:"tags"`
	VersionId string `json:"versionId"`
	UploadStatus string `json:"uploadStatus"`
}
