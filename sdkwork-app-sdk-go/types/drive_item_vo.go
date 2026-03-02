package types

// Drive item
type DriveItemVO struct {
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
	Resource FileMediaResource `json:"resource"`
	CoverImage ImageMediaResource `json:"coverImage"`
}
