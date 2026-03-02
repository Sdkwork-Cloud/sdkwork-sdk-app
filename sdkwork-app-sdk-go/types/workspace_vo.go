package types

// 工作空间响应
type WorkspaceVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	WorkspaceId string `json:"workspaceId"`
	WorkspaceName string `json:"workspaceName"`
	WorkspaceDescription string `json:"workspaceDescription"`
	WorkspaceIcon string `json:"workspaceIcon"`
	WorkspaceColor string `json:"workspaceColor"`
	WorkspaceType string `json:"workspaceType"`
	CreatorId string `json:"creatorId"`
	CreatorName string `json:"creatorName"`
	CreateTime string `json:"createTime"`
	UpdateTime string `json:"updateTime"`
	MemberCount int `json:"memberCount"`
	ProjectCount int `json:"projectCount"`
	Status string `json:"status"`
	IsPublic bool `json:"isPublic"`
	UserRole string `json:"userRole"`
	UserPermissions []string `json:"userPermissions"`
	Settings WorkspaceSettings `json:"settings"`
}
