package types

// Create drive folder form
type DriveFolderCreateForm struct {
	Name string `json:"name"`
	ParentId string `json:"parentId"`
	DiskId string `json:"diskId"`
}
