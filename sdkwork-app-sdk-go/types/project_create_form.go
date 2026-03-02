package types

// 项目创建请求
type ProjectCreateForm struct {
	WorkspaceId string `json:"workspaceId"`
	ProjectName string `json:"projectName"`
	ProjectDescription string `json:"projectDescription"`
	ProjectType string `json:"projectType"`
	ProjectIcon string `json:"projectIcon"`
	ProjectColor string `json:"projectColor"`
	ProjectTags []string `json:"projectTags"`
	Members []ProjectMember `json:"members"`
	Settings ProjectSettings `json:"settings"`
}
