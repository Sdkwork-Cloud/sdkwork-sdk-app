package types

// Create folder request
type FileSystemFolderCreateForm struct {
	Name string `json:"name"`
	ParentId string `json:"parentId"`
	DiskId string `json:"diskId"`
	Description string `json:"description"`
	Tags []string `json:"tags"`
}
