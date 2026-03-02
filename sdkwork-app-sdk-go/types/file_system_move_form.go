package types

// Move node request
type FileSystemMoveForm struct {
	TargetParentId string `json:"targetParentId"`
	TargetDiskId string `json:"targetDiskId"`
}
