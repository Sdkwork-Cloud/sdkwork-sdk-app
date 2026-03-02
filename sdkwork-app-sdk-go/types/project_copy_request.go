package types


type ProjectCopyRequest struct {
	TargetWorkspaceId string `json:"targetWorkspaceId"`
	NewName string `json:"newName"`
}
