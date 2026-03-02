package types

// 工作空间创建请求
type WorkspaceCreateForm struct {
	WorkspaceName string `json:"workspaceName"`
	WorkspaceDescription string `json:"workspaceDescription"`
	WorkspaceIcon string `json:"workspaceIcon"`
	WorkspaceColor string `json:"workspaceColor"`
	WorkspaceType string `json:"workspaceType"`
	Members []WorkspaceMember `json:"members"`
	Settings WorkspaceSettings `json:"settings"`
}
