package types

// 项目响应
type ProjectVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ProjectId string `json:"projectId"`
	ProjectName string `json:"projectName"`
	ProjectDescription string `json:"projectDescription"`
	ProjectType string `json:"projectType"`
	ProjectIcon string `json:"projectIcon"`
	ProjectColor string `json:"projectColor"`
	ProjectTags []string `json:"projectTags"`
	WorkspaceId string `json:"workspaceId"`
	WorkspaceName string `json:"workspaceName"`
	CreatorId string `json:"creatorId"`
	CreatorName string `json:"creatorName"`
	CreateTime string `json:"createTime"`
	UpdateTime string `json:"updateTime"`
	MemberCount int `json:"memberCount"`
	FileCount int `json:"fileCount"`
	Status string `json:"status"`
	IsPublic bool `json:"isPublic"`
	UserPermissions []string `json:"userPermissions"`
}
