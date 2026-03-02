package types

// Copy node request
type FileSystemCopyForm struct {
	TargetParentId string `json:"targetParentId"`
	TargetDiskId string `json:"targetDiskId"`
	Name string `json:"name"`
	CopyContent bool `json:"copyContent"`
}
