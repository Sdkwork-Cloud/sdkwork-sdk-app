package types

// 工作空间更新请求
type WorkspaceUpdateForm struct {
	WorkspaceId string `json:"workspaceId"`
	WorkspaceName string `json:"workspaceName"`
	WorkspaceDescription string `json:"workspaceDescription"`
	WorkspaceIcon string `json:"workspaceIcon"`
	WorkspaceColor string `json:"workspaceColor"`
	Settings WorkspaceSettings `json:"settings"`
}
